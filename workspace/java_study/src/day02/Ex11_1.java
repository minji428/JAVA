package day02;

import java.util.Random;
import java.util.Scanner;
/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */

public class Ex11_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int rNum = ran.nextInt(100)+1;
		System.out.println("문제 : "+rNum);
		
		System.out.println("1.짝수");
		System.out.println("2.홀수");		
		
		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		if(choice==1) {
			if(rNum%2==0) {
				System.out.println("정답!");
			}
			else {
				System.out.println("오답");
			}
		}
		if(choice==2) {
			if(rNum%2==1) {
				System.out.println("정답!");
			}
			else {
				System.out.println("오답");
			}
		}
		
		
		scan.close();
	}
}
