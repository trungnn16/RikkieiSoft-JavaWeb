package Buoi2_Database;

import java.util.ArrayList;
import java.util.Scanner;

/*Main để test các hàm trong CDDatabase*/
/*
 * TẠO MỘT CƠ SỞ DỮ LIỆU CÓ TÊN LÀ cds GỒM 1 BẢNG cds(artist varchar(),title varchar()) TRƯỚC KHI CHẠY CHƯƠNG TRÌNH
 */
public class MainCDs {
	public static void main(String[] args) {
		Connect con = new Connect();
		con.Connection();
		CDDatabse cd = new CDDatabse();
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu chương trình");
			System.out.println("1.In Bảng");
			System.out.println("2.Delete 1 dữ liệu");
			System.out.println("3.Insert dữ liệu");
			System.out.println("4.Tìm kiếm theo Artist");
			System.out.println("5.Tìm kiếm theo Title");
			System.out.println("6.Thoát");
			do {
				System.out.print("Chọn chương trình: ");
				n = sc.nextInt();
				if (n > 6 || n < 1)
					System.out.println("Chọn lại.");
			} while (n > 6 || n < 1);
			switch (n) {
				case 1: {
					System.out.printf("%-20s%-20s\n", "Arstits", "Title");
					cd.showData(cd.selectData(con));
				}
					break;
				case 2: {
					sc.nextLine();
					CD newCD = new CD();
					System.out.print("Nhập artist: ");
					newCD.setArtist(sc.nextLine());
					System.out.print("Nhập title: ");
					newCD.setTitle(sc.nextLine());
					cd.removeCD(newCD, con);
	
				}
					break;
				case 3: {
					sc.nextLine();
					ArrayList<CD> list = new ArrayList<>();
					FillDatabase fd = new FillDatabase();
					list = fd.nhapThongTin();
					for (int i = 0; i < list.size(); i++) {
						cd.insertCD(list.get(i), con);
					}
				}
					break;
				case 4: {
					sc.nextLine();
					String s;
					System.out.print("Nhập artist: ");
					s = sc.nextLine();
					System.out.printf("%-20s%-20s\n", "Arstits", "Title");
					cd.showData(cd.findByArtist(s, con));
				}
					break;
				case 5: {
					sc.nextLine();
					String s;
					System.out.print("Nhập title: ");
					s = sc.nextLine();
					System.out.printf("%-20s%-20s\n", "Arstits", "Title");
					cd.showData(cd.findByTitle(s, con));
				}
				case 6:{
					System.out.println("Chào");
				}
				break;
			}
		} while (n != 6);

	}
}
