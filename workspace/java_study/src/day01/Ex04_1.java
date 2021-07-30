package day01;

public class Ex04_1 {
	public static void main(String[] args) {
		
		//점수가 60점 이상이면 true 출력
		int score = 90;
		System.out.println(score>=60);
		System.out.println();
		
		//문제1) 3의 배수이면 true 출력
		int num1 = 15;
		System.out.println(num1%3==0);
		System.out.println();
		
		//문제2) 짝수이면 true 출력
		int num2 = 20;
		System.out.println(num2%2==0);
		System.out.println();
		
		//문제3) 아래 돈 중 1000원짜리 이상 화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
		int money = 178600;
		System.out.println((money%5000/1000)>=3);
		System.out.println();
		
	}
}
