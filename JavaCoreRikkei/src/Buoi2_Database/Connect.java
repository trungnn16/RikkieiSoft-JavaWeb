package Buoi2_Database;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

/*Class kết nối MySQL  với java*/

public class Connect {
	private final String name = "com.mysql.jdbc.Driver";
	private java.sql.Connection connection;
	private final String url = "jdbc:mysql://localhost:3306/cds";
	private final String user = "root";
	private final String password = "ngoctrung166";

	public java.sql.Connection getConnection() {
		return connection;
	}

	public void setConnection(java.sql.Connection connection) {
		this.connection = connection;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void Connection() {
		try {
			Class.forName(name);
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Kết nối cơ sở dữ liệu thành công");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Thất bại");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
