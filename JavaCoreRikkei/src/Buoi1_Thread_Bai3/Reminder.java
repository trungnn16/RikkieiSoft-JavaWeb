package Buoi1_Thread_Bai3;

import java.util.TimerTask;

public class Reminder extends TimerTask {
	String messege;
	
	public Reminder(String messege) {
		super();
		this.messege = messege;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(messege);
		
		
	}

}
