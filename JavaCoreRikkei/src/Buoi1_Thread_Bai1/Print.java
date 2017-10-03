package Buoi1_Thread_Bai1;

public class Print {
	public static void main(String [] args) {
		PrintNumbers pr = new PrintNumbers();
		Thread th = new Thread(pr);
		th.start();;
		int sleep = Integer.parseInt(args[0]);
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pr.stopPrinting();;
	}
	
}