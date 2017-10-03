package Buoi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.ArrayList;

public class Bai1 {
	public void writeFile(String fname) {

		Writer wr = null;
		try {
			wr = new FileWriter(fname, true);
			try (BufferedWriter bw = new BufferedWriter(wr)) {
				for (int i = 0; i < 100; i++) {
					String s = new String();
					s = "abc";
					bw.write(s);
					bw.newLine();
				}
			}
		} catch (IOException e) {
		}
	}

	public int demsodong(String fname) {
		ArrayList<Bai1> list = new ArrayList<>();
		int i = 0;
		int sum = 0;
		int soluongtu = 0;
		try {
			InputStream in = new FileInputStream(fname);
			Reader read = new InputStreamReader(in, "UTF-8");
			try (BufferedReader br = new BufferedReader(read)) {
				String s = br.readLine();
				while (s != null) {
					i++;
					String arr[] = s.split(" ");
					System.out.println("Dong  " + i + " co " + arr.length + " tu");
					sum += arr.length;
					s = br.readLine();

				}
				System.out.println(sum);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		} catch (UnsupportedEncodingException ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Lỗi: " + ex.getMessage());
		}
		return i;
	}


	public static void main(String[] args) {
		Bai1 x = new Bai1();
		x.writeFile("trung.txt");
		System.out.println(x.demsodong("trung.txt"));
	}
}
