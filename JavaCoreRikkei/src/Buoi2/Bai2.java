package Buoi2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public int demsokitu(String fname) {
		ArrayList<Bai1> list = new ArrayList<>();
		int i = 0;
		try {
			InputStream in = new FileInputStream(fname);
			if(in==null) {
				return 0;
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}
		return 1;
	}

	public static void main(String[] args) {
		Bai2 x = new Bai2();
		String fname = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		fname = sc.nextLine();
		if (x.demsokitu(fname) == 0) {
			System.out.println("Khong co file nay");
		} else
			System.out.println("Co file nay");
	}
}
