package day28_ATM;

public class User {
	String name = "";
	Account acc[] = null;
	int accCount = 0;
	
	void printAccount() {
		System.out.println(name+"´ÔÀÇ °èÁÂ");
		for(int i=0; i<accCount; i++) {
			acc[i].print();
		}
	}
}
