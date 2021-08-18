package day17;

/*
 * [1] 변수 : 값 한 개 저장
 * [2] 배열 : (같은 종류의)값 여러 개 저장
 * [3] 클래스 : (여러 종류의)값 여러 개 저장
 */

class Student {
	String name;
	int score;
}

public class Ex00Class {
	public static void main(String[] args) {
		
		String[] names = {"a", "b", "c"};
		int[] scores = {100, 23, 87};
		
		// 클래스 사용
		Student hgd = new Student();
		hgd.name = "홍길동";
		hgd.score = 100;
		
	}
}
