package test;

import java.beans.Statement;
import java.lang.Thread.State;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class myConnect {
	private final String className="com.mysql.jdbc.Driver";
	private java.sql.Connection connection;
	private final String url="jdbc:mysql://localhost:3306/test";
	private final String user ="root";
	private final String password ="ngoctrung166";
	private final String table ="hocsinh";
	private void connect() {
		try {
			Class.forName(className);
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("Thanhf coong");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error connection");
		}
	}
	private void showData(ResultSet rs) {
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private ResultSet getData() {
		ResultSet rs = null;
		String sqlCommand = "select * from "+table;
		java.sql.Statement st ;
		try {
			st = connection.createStatement();
			rs=st.executeQuery(sqlCommand);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error \n"+e.toString());
		}
//		ts.executeQ();
		return rs;
		
	}
	public static void main(String[] args) {
		myConnect myconect = new myConnect();
		myconect.connect();
		myconect.showData(myconect.getData());
	}
}
