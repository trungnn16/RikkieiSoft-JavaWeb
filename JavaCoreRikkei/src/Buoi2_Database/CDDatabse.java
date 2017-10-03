package Buoi2_Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CDDatabse {
	/* INSERT CƠ SỞ DỮ LIỆU */
	public void insertCD(CD cd, Connect con) {
		String insert = "insert into cds values(?,?)";
		PreparedStatement pst = null;
		try {
			pst = con.getConnection().prepareStatement(insert);
			pst.setString(1, cd.getArtist());
			pst.setString(2, cd.getTitle());
			if (pst.executeUpdate() > 0) {
				System.out.println("Thành công");
			} else {
				System.out.println("Thất bại");
			}
		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/* XÓA MỘT DỮ LIỆU TRONG BẢNG */
	public void removeCD(CD cd, Connect con) {
		String remove = "delete from cds where artist = ? and title = ?";
		PreparedStatement pst = null;
		try {
			pst = con.getConnection().prepareStatement(remove);
			pst.setString(1, cd.getArtist());
			pst.setString(2, cd.getTitle());
			// pst.executeQuery();
			if (pst.executeUpdate() > 0)
				System.out.println("Thành công");
			else
				System.out.println("Không tồn tại");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Xóa thất bại " + e.toString());
		}
	}

	/* TÌM KIẾM THEO ARTIST */
	public ResultSet findByArtist(String artist, Connect con) {
		ResultSet rs = null;
		String search = "select * from cds where artist = ?";
		PreparedStatement pst = null;
		try {
			pst = con.getConnection().prepareStatement(search);
			pst.setString(1, artist);
			rs = pst.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

	/* TÌM KIẾM THEO TITLE */
	public ResultSet findByTitle(String title, Connect con) {
		ResultSet rs = null;
		String search = "select * from cds where title = ?";
		PreparedStatement pst = null;
		try {
			pst = con.getConnection().prepareStatement(search);
			pst.setString(1, title);
			rs = pst.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

	/* IN DỮ LIỆU */
	public void showData(ResultSet rs) {
		try {
			while (rs.next()) {
				System.out.printf("%-20s%-20s\n", rs.getString(1), rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* SELECT TOÀN BỘ DỮ LIỆU TRONG BẢNG cds */
	public ResultSet selectData(Connect conect) {
		ResultSet rs = null;
		String select = "Select * from cds";
		java.sql.Statement st;
		try {
			st = conect.getConnection().createStatement();
			rs = st.executeQuery(select);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Thất bại");
		}
		return rs;

	}
}
