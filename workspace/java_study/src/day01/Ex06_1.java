package day01;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("실행 O");
		}
		if(false) {
			System.out.println("실행 X");
		}
		//예) 홀짝
		int num = 8;
		System.out.println(num%2==0);
		System.out.println(num%2==1);
		
		if(num%2==0) {
			System.out.println("짝수");
		}
		if(num%2==1) {
			System.out.println("홀수");
		}
		System.out.println();
		
		//문제1) 양수, 0, 음수 출력
		num = -10;
		if(num>0) {
			System.out.println("양수");
		}
		if(num==0) {
			System.out.println("0");
		}
		if(num<0) {
			System.out.println("음수");
		}
		System.out.println();
		
		//문제2) 4의 배수 출력
		num = 12;
		if(num%4==0) {
			System.out.println("4의 배수이다.");
		}
		else {
			System.out.println("4의 배수가 아니다.");
		}
		System.out.println();
		
		//문제3) 60점 이상 합격, 불합격 출력
		int score = 87;
		if(score>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
