package controller;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

import bean.*;
import bean.Types;
import Unity.ConnectionDB;

public class ProjectManager {
	public List<People> getAllPeople(){
		List<People> people = new ArrayList<People>();
		ConnectionDB condb = new ConnectionDB();
		try {
			Connection con = condb.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select peopleid,peoplefirstname,peoplelastname,peoplebirthday,phonenumber,roomnumber,email,facebook,line,domitoryid,domitoryname,typeid,typedetail from getallpeople";
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				People p = new People();
				p.setPeopleid(rs.getString(1));
				p.setPeoplefirstname(rs.getString(2));
				p.setPeoplelastname(rs.getString(3));
				p.setPeoplebirthday(rs.getDate(4));
				p.setPhonenumber(rs.getString(5));
				p.setRoomnumber(rs.getString(6));
				p.setEmail(rs.getString(7));
				p.setFacebook(rs.getString(8));
				p.setLine(rs.getString(9));
				Domitory d = new Domitory(rs.getString(10),rs.getString(11));
				Types t = new Types(rs.getString(12),rs.getString(13));
				p.setDomitory(d);
				p.setType(t);
				people.add(p);
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
	}
	public List<Login> getLogin(){
		List<Login> list = new ArrayList<Login>();
		ConnectionDB condb = new ConnectionDB();
		
		String sql = "select peopleid,peoplebirthday,types.typeid,typedetail from people inner join types on people.typeid = types.typeid";
		try {
			Connection con = condb.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				Login l = new Login();
				l.setUsername(rs.getString(1));
				SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
				String date = sdf.format(rs.getDate(2));
				l.setPassword(date);
				Types t = new Types();
				t.setTypeid(rs.getString(3));
				t.setTypedetail(rs.getString(4));
				l.setTypes(t);
				list.add(l);
				
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public People getPeopleByID(String id) {
		People people = null;
		ConnectionDB condb = new ConnectionDB();
		Connection con;
		try {
			con = condb.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select peopleid,peoplefirstname,peoplelastname,peoplebirthday,phonenumber,roomnumber,email,facebook,line,domitoryid,domitoryname,typeid,typedetail from getallpeople where peopleid = "+id;
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				People p = new People();
				p.setPeopleid(rs.getString(1));
				p.setPeoplefirstname(rs.getString(2));
				p.setPeoplelastname(rs.getString(3));
				p.setPeoplebirthday(rs.getDate(4));
				p.setPhonenumber(rs.getString(5));
				p.setRoomnumber(rs.getString(6));
				p.setEmail(rs.getString(7));
				p.setFacebook(rs.getString(8));
				p.setLine(rs.getString(9));
				Domitory d = new Domitory(rs.getString(10),rs.getString(11));
				Types t = new Types(rs.getString(12),rs.getString(13));
				p.setDomitory(d);
				p.setType(t);
				people = p;
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return people;
		
	}
	public List<News> getNewsByDomitory(String domid) {
		List<News> news = new ArrayList<News>();
		ConnectionDB condb = new ConnectionDB();
		Connection con;
		try {
			con = condb.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select newsid,newscreated,newsdiscription,newstitle,hints,peopleid,peoplefirstname,domitoryid,domitoryname from getallnews where domitoryid = "+domid;
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				News n = new News();
				n.setNewsid(rs.getString(1));
				Calendar c = Calendar.getInstance();
				c.setTime(rs.getDate(2));
				n.setNewscreated(c);
				n.setNewsdiscription(rs.getString(3));
				n.setNewstitle(rs.getString(4));
				n.setHints(rs.getInt(5));
				People people = new People();
				people.setPeopleid(rs.getString(6));
				people.setPeoplefirstname(rs.getString(7));
				Domitory dom = new Domitory();
				dom.setDomitoryid(rs.getString(8));
				dom.setDomitoryname(rs.getString(9));
				people.setDomitory(dom);
				n.setPeople(people);
				news.add(n);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return news;
		
	}
	public int updateHints(News news) {
		ConnectionDB condb = new ConnectionDB();
		int result =0;
		try {
			Connection conn = condb.getConnection();
			CallableStatement stmt = conn.prepareCall("{call addhints(?)}");
			stmt.setString(1, news.getNewsid());
			stmt.execute();
			result = stmt.getUpdateCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public News getNewsByID(String nid) {
		News n = new News();
		ConnectionDB condb = new ConnectionDB();
		Connection con;
		try {
			con = condb.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select newsid,newscreated,newsdiscription,newstitle,hints,peopleid,peoplefirstname,domitoryid,domitoryname from getallnews where newsid = "+nid;
			ResultSet rs =stmt.executeQuery(sql);
			if(rs.next()) {
				n.setNewsid(rs.getString(1));
				Calendar c = Calendar.getInstance();
				c.setTime(rs.getDate(2));
				n.setNewscreated(c);
				n.setNewsdiscription(rs.getString(3));
				n.setNewstitle(rs.getString(4));
				n.setHints(rs.getInt(5));
				People people = new People();
				people.setPeopleid(rs.getString(6));
				people.setPeoplefirstname(rs.getString(7));
				Domitory dom = new Domitory();
				dom.setDomitoryid(rs.getString(8));
				dom.setDomitoryname(rs.getString(9));
				people.setDomitory(dom);
				n.setPeople(people);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n;
		
	}
}
