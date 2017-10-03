package Buoi1_Thread_Bai2;

public class Race {
	public static void main(String[] args) {
		Thread []th = new Thread[5];
		for(int i = 0;i<5;i++) {
			RaceCar rc = new RaceCar(Integer.parseInt(args[5]), args[i]);
			th[i] = new Thread(rc);
		}
		
		for(int i =0;i<5;i++) {
			th[i].start();
		}
	}
	
}
