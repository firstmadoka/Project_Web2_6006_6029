package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("login");
		session.setMaxInactiveInterval(0);
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String rememberUaP = request.getParameter("rememberUaP");
		String remember = request.getParameter("remember");
		
		if("1".equals(remember) )
		/*if(null != rememberUaP )*/ {
		  	Cookie c1 = new Cookie("uname", uname);
			Cookie c2 = new Cookie("pwd", pwd);
			c1.setMaxAge(60*60*24*10);
			c2.setMaxAge(60*60*24*10);
			response.addCookie(c1);
			response.addCookie(c2);
		 
		}else if("2".equals(remember) )
			/*if(null != remember )*/ {
		  	Cookie c1 = new Cookie("uname", uname);
			c1.setMaxAge(60*60*24*10);
			Cookie c2 = new Cookie("pwd", pwd);
			c2.setMaxAge(0);
			response.addCookie(c1);
			response.addCookie(c2);
		}else {
			Cookie c1 = new Cookie("uname", "");
			Cookie c2 = new Cookie("pwd", "");
			c1.setMaxAge(0);
			c2.setMaxAge(0);
			response.addCookie(c1);
			response.addCookie(c2);
		}
		
		
		HttpSession session = request.getSession();
		
		Login login = new Login(uname,pwd);
		LoginManager lm= new LoginManager();
		boolean result = lm.verifyLogin(login);
		if(result) {
			session.setAttribute("login", login);
			session.setMaxInactiveInterval(60*15);
			response.sendRedirect("Main.jsp");
		}else {
			request.setAttribute("error", "wrong username and password!! ");
			goTo("/index.jsp", request ,response);
		}

	}
	protected void goTo(String url, HttpServletRequest request,HttpServletResponse response) {
		if (url != null) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
			}catch (Exception e) {
				
			}
		}
		}
	}
