package Unity;

import java.sql.*;

public class ConnectionDB {
	String uname = "itproject";
	String pwd = "1234";
	Connection con;
	public Connection getConnection() throws SQLException {
		con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",uname,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
