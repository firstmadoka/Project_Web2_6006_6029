package controller;

import java.sql.*;
import java.util.*;

import bean.*;
import Unity.ConnectionDB;

public class ProjectManager {
	public People getLogin(String peopleid){
		People people = null;
		ConnectionDB condb = new ConnectionDB();
		try {
			Connection con = condb.getConnection();
			Statement stmt = con.createStatement();
			String sql = "Select username,password from login";
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				Login l = new Login(rs.getString(1),rs.getString(2));
				login.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;
	}
}
