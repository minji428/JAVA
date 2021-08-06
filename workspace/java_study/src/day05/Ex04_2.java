package day05;

import java.util.Random;
import java.util.Scanner;

/*
 * # 즉석복권
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 */
public class Ex04_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = {0,0,7,7,7,0,0,0};
		for(int i = 0; i<7; i++) {
			lotto[i] = ran.nextInt(2);
			if(lotto[i]==0) {
				lotto[i]=7;
			}
			else if(lotto[i]==1) {
				lotto[i]=0;
			}
			
			System.out.print(lotto[i]);
		}
		System.out.println();
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("1) 복권 결과 확인");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				for(int i = 0; i<6; i++) {
					if(lotto[i]==7 && lotto[i+1]==7&&lotto[i+2]==7) {
						System.out.println("당첨");
						break;
					}
				}
			}
		}
		scan.close();
	}
}