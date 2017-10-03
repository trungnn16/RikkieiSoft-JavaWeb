package buoi2_javabean;

/* MainCustomer set vào bean Customer giá trị ID=1 và tên = RikkeiSoft 
 * sau đó in các giá trị này ra từ bean Customer
 */
public class MainCustomer {
	public void printCustomer() {
		Customer x = new Customer();
		x.setID(1);
		x.setName("RikkeiSoft");
		System.out.println(x.getID() + "\t" + x.getName());
	}

	/*
	 * Hàm main Customer
	 */
	public static void main(String[] args) {
		MainCustomer x = new MainCustomer();
		x.printCustomer();
	}
}
