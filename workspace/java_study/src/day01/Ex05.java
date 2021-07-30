package day01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* 입력받기
		 * 1. import java.util.Scanner;
		 * 	java.util패키지 안의 Scanner 클래스 파일을 현재 페이지로 불러온다.
		 * 2. scan 변수 설정
		 * 	Scanner scan = new Scanner(system.in);
		 * 3. 안내문 작성
		 * 	System.out.print("나이를 입력하세요 : ");
		 * 4. 입력받기
		 * 	int age = scan.nextInt();
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 "+num+"입니다");
		System.out.println();
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 "+age+"세 이군요!");
		System.out.println();
		
		//문제1) 숫자 2개를 입력받아 합 출력
		System.out.println("숫자 2개를 입력하세요");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum = num1+num2;
		System.out.println("합 = "+sum);
		System.out.println();
		
		//문제2) 숫자 1개를 입력받아 홀수이면 true 출력
		System.out.println("숫자 1개를 입력하세요");
		int x = scan.nextInt();
		System.out.println(x%2==1);
		System.out.println();
		
		//문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적을 입력하세요");
		int score = scan.nextInt();
		System.out.println(60<=score&&score<=100);
		
		scan.close();
		
	}
}
