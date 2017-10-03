package Buoi1_Thread_Bai1;

public  class PrintNumbers implements Runnable {
	boolean keepGoing;
	Thread thread;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}while(this.keepGoing!=false);
		
	}
	public PrintNumbers() {
		super();
		this.keepGoing = true;
	}
	public void stopPrinting() {
		this.keepGoing = false;
	}

	
}
