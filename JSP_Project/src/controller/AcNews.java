package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.News;

/**
 * Servlet implementation class CountHints
 */
@WebServlet("/AcNews")
public class AcNews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcNews() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String g = request.getParameter("newsid");
		ProjectManager pjm = new ProjectManager();
		News n = pjm.getNewsByID(g);
		int x = pjm.updateHints(n);
		if(x == 1) {
			request.setAttribute("news", n);
			goTo("/news.jsp",request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void goTo(String url, HttpServletRequest request,
			HttpServletResponse response) {
			if (url != null) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			try { dispatcher.forward(request, response); }
			catch (Exception e) {}
			}
			}
}
