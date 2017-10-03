package test;

public class Student {
	private int ms;
	private String name;
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int ms, String name) {
		super();
		this.ms = ms;
		this.name = name;
	}
	public Student() {
		super();
	}
	
}
