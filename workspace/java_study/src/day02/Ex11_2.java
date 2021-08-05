package day02;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
public class Ex11_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(8)+2;
		int y = ran.nextInt(9)+1;
		int answer = x*y;
		
		System.out.println(x+"x"+y+"= ?");
		
		int myAnswer = scan.nextInt();
		
		if(answer==myAnswer) {
			System.out.println("정답");
		}
		else {
			System.out.println("땡");
		}
		
		scan.close();
		
	}
}
