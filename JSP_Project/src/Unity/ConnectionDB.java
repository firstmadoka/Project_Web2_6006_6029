package Unity;

import java.sql.*;

public class ConnectionDB {
	String url = "jdbc:mysql://localhost:3308/project?characterEncoding=UTF-8";
	String uname = "root";
	String pwd = "root";
	Connection con;
	public Connection getConnection() throws SQLException {
		con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
