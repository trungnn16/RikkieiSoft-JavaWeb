package Week1_ClassCoBan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int day,month,year;
		do {
			System.out.print("Nhập ngày: ");
			day = sc.nextInt();
			if(day<1||day>31) {
				System.out.println("Nhập lại ngày");
			}
		}while(day<1||day>31);
		do {
			System.out.print("Nhập tháng: ");
			month = sc.nextInt()-1;
			if(month>12||month<0) {
				System.out.println("Nhập lại tháng: ");
			}
		}while(month>12||month<0);
		System.out.print("Nhập năm: ");
		year = sc.nextInt();
		String s1= String.valueOf(day);
		String s2 = String.valueOf(month+1);
		String s3 = String.valueOf(year);
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dateFormat2 = new SimpleDateFormat("YY-MM-dd");
		
		Calendar currentDate = Calendar.getInstance();
		Calendar sCurrentDate = Calendar.getInstance();
		Calendar date = Calendar.getInstance();
		try {
			date.setTime(dateFormat1.parse(s3 + '-' + s2 + '-' + s1));
			sCurrentDate.setTime(dateFormat1.parse(dateFormat1.format(currentDate.getTime())));
			System.out.println("Ngày nhập: "+dateFormat2.format(date.getTime()));
			System.out.println("Ngày hôm nay: " + dateFormat2.format(currentDate.getTime()));
			
			long  x = ((date.getTimeInMillis() - sCurrentDate.getTimeInMillis())/86400000);
			if (x == 0)
				System.out.println("Ngày tháng nhập vào trùng ngày hôm nay!");
			else if(x > 0)
				System.out.println("Ngày tháng nhập vào muộn hơn ngày tháng hôm nay "+x+ " ngày.");
			else
				System.out.println("Ngày tháng nhập vào sớm hơn ngày tháng hôm nay "+(-x)+ " ngày.");

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
		
}
