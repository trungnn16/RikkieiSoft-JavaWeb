package Week1_ClassCoBan;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai4 {
	public static boolean checkPhoneNumber(String s){
		return Pattern.matches("\\d+-\\d+-\\d+", s);
	}
	public static boolean checkEmail(String s) {
		return Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập vào số điện thoại: ");
//		String phone = sc.nextLine();
//		if(checkPhoneNumber(phone)) {
//			System.out.println("Đúng định dạng số điện thoại");
//		}
//		else {
//			System.out.println("Không đúng định dạng số điện thoại");
//		}
		System.out.print("Nhập vào email: ");
		String email = sc.nextLine();
		if(checkEmail(email)) {
			System.out.println("Đúng định dạng email");
		}
		else {
			System.out.println("Không đúng định dạng email");
		}
		
	}
}
