package day24;

class Subject1{
	String name;
	int score;
}

class Student1{
	Subject1[] subjects;
	String name;
}

public class Ex01_7 {
	public static void main(String[] args) {
		Student1[] st = new Student1[3];
		
		st[0] = new Student1();
		st[0].subjects = new Subject1[3];
		
		for(int i=0; i<3; i++) {
			st[0].subjects[i] = new Subject1();
		}
		
		st[1] = new Student1();
		st[1].subjects = new Subject1[2];
		st[1].subjects[0] = new Subject1();
		st[1].subjects[1] = new Subject1();
		
		st[2] = new Student1();
		st[2].subjects = new Subject1[1];
		st[2].subjects[0] = new Subject1();
		
	}
}
