package Buoi2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class user implements Serializable {
	private String use;
	private int age;
	private String addres;
	private int score;
	
	
	public ArrayList<user> ghithongtin(ArrayList<user> list) {
		user x = new user();
		String a, c;
		int b, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap user: ");
		a = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap addres: ");
		c = sc.nextLine();
		System.out.println("Nhap diem: ");
		d = sc.nextInt();
		x.use = a;
		x.age = b;
		x.score = d;
		x.addres = c;
		list.add(x);
		return list;
	}

	public void ghiFile(ArrayList list,String name) {
		try(FileOutputStream fos = new FileOutputStream(new File(name))){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<user> docFile(String fname) {
		FileInputStream is;
		ArrayList<user> list = new ArrayList<>();
		try {
			is = new FileInputStream(fname);
			ObjectInputStream ois = new ObjectInputStream(is);
		
			list=(ArrayList<user>)ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public static void main(String[] args) {
		Comparator<user> sort = new Comparator<user>() {

			@Override
			public int compare(user o1, user o2) {
				// TODO Auto-generated method stub
				return o1.use.compareTo(o2.use);
			}
			
		};
		Scanner sc = new Scanner(System.in);
		int n;
		user q = new user();
		System.out.println("Nhap so luong: ");
		n = sc.nextInt();
		ArrayList<user> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list = q.ghithongtin(list);
		}
		int tong=0;
		q.ghiFile(list,"trung7.txt");
		 ArrayList<user> list2 = new ArrayList<>();
		 list2 = q.docFile("trung7.txt");
		 list2.sort(sort);
		System.out.println("Doc file ra:");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println("user: " + list2.get(i).use + "\t" + "age: " + list2.get(i).age + "\t" + "addres: "
					+ list2.get(i).addres + "\t" + "score: " + list2.get(i).score);
			tong = tong+list2.get(i).score;
		}
		System.out.println(tong);

	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
