package day20;

class Student{
	String name;
	int score;
}

public class Ex01_2 {
	public static void main(String[] args) {
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.

		Ex01 e = new Ex01();	// 클래스 : 사용자 정의 자료형(개발자가 직접 만듦)
		e.x = 10;
		e.y = 20;
		
		Student hgd = new Student();
		hgd.name = "홍길동";
		hgd.score = 100;
		
		System.out.println(hgd);	//day20.Student@7852e922

	}
}
