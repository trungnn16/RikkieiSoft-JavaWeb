package buoi2_javabean;

import java.io.Serializable;

/*Class Customer*/
public class Customer implements Serializable {
	private long ID;
	private String name;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
