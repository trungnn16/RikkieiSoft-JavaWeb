package Buoi1_Thread_Bai2;

import java.util.Random;

public class RaceCar extends Thread  {
	int finish;
	String name;
	public RaceCar(int finish, String name) {
		super();
		this.finish = finish;
		this.name = name;
	}
	public RaceCar() {
		super();
	}
	public void run() {
		for(int i=0;i<this.finish;i++) {
			System.out.println(this.name+": "+(i+1));
			Random rand = new Random();
			int x = rand.nextInt(6);
			try {
				Thread.sleep(x);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.name+" finished");
	}
}
