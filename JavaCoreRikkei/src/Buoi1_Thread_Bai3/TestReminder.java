package Buoi1_Thread_Bai3;

import java.util.Timer;

public class TestReminder {
	public static void main(String[] args) {
		Reminder r1 = new Reminder(args[0]);
		Reminder r2 = new Reminder(args[1]);
		Reminder r3 = new Reminder(args[2]);
		Timer  time = new Timer();
		time.schedule(r1, 0);
		time.schedule(r2, 30000);
		time.schedule(r3,120000);
	}
}
