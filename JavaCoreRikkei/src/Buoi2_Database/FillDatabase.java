package Buoi2_Database;

import java.util.ArrayList;
import java.util.Scanner;

/* NHẬP THÔNG TIN CẦN MUỐN INSERT VÀO CSDL */
public class FillDatabase {
	public ArrayList<CD> nhapThongTin() {
		ArrayList<CD> list = new ArrayList<>();
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập số lượng muốn thêm: ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Nhập lại");
			}
		} while (n < 0);
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			CD cd = new CD();
			System.out.print("Nhập artits: ");
			cd.setArtist(sc.nextLine());
			System.out.println("Nhập title: ");
			cd.setTitle(sc.nextLine());
			list.add(cd);
		}
		return list;

	}
}
