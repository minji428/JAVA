package day02;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */
public class Ex15_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int score = 0;
		int i = 0;
		while(i<5) {
			int x = ran.nextInt(8)+1;
			int y = ran.nextInt(9)+1;
		
			int answer = x*y;
			System.out.println(x+"x"+y+"= ?");
			int myAnswer = scan.nextInt();
			
			if(answer==myAnswer) {
				cnt++;
			}
			i++;
		}
		score = cnt*20;
		System.out.println("성적 ="+score+"점");
		
		scan.close();
	}
}
