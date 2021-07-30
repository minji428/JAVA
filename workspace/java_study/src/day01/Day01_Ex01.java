package day01;

import java.util.Random;
import java.util.Scanner;

public class Day01_Ex01 {
	// main + [ctrl + spacebar]
	public static void main(String[] args) {
		
		// 출력문 : sout + [ctrl + spacebar]
		System.out.println("안녕");
		System.out.println("하세요");
		
		// 실행 : ctrl + f11
		
		// 입력 : scanner + [ctrl + spacebar] + scan = + new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		// scan 경고창이 안나려면 scan.close(); 입력
		scan.close();
		
		
		// 랜덤 Random + [ctrl + spacebar] + ran = new Random();
		// 랜덤은 ()안에 숫자를 꼭 넣어줘야 함
		Random ran = new Random();
		int r = ran.nextInt(3);			// 0, 1, 2
		System.out.println(r);
		
		//영수증 만들기
		System.out.println("==========");
		System.out.println("스타벅스");
		System.out.println("현금(소득공제)");
		System.out.println("t)까페라떼     5000");
		
		//1.숫자(정수)
		System.out.println(10);
		//2.숫자(실수)
		System.out.println(3.14);
		//3.문자 한 개 : 홑따옴표
		System.out.println('B');
		//4.문자 여러개 : 쌍따옴표
		System.out.println("Java Class");
		
		
	}
}
