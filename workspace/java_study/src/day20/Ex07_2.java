package day20;
/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
 * 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
 */

import java.util.Random;
import java.util.Scanner;

class Ex15{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	
	int total = 0;
}

public class Ex07_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex15 e = new Ex15();
		
		for(int i=0; i<e.game.length; i++) {
			int r = ran.nextInt(10)+1;
			
			// 중복확인
			int check = 1;
			for(int j=0; j<i; j++) {
				if(e.game[j] == r) {
					check =-1;
				}
			}
			if(check == 1) {
				e.game[i] = r;
			}
			else {
				i -= 1;
			}
		}
		System.out.println("\t[더하기 게임]");
		System.out.print("숫자카드 >>>");
		for(int i=0; i<e.game.length; i++) {
			System.out.print(e.game[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<e.idx.length; i++) {
			int r = ran.nextInt(e.game.length);
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(e.idx[j] == r) {
					check =-1;
				}
			}
			if(check == 1) {
				e.idx[i] = r;
				e.total += e.game[r];
			}
			else {
				i -= 1;
			}
		}
		System.out.println("치트키 >>>");
		for(int i=0; i<e.idx.length; i++) {
			System.out.print(e.idx[i]+" ");
		}
		System.out.println();
		System.out.println("합 = "+e.total);
		
		while(true) {
			
			int total = 0;
			
			for(int i=0; i<e.myIdx.length; i++) {
				System.out.print((i+1)+".인덱스 입력 : ");
				int idx = scan.nextInt();
				
				int check = 1;
				for(int j=0; j<i; j++) {
					if(e.myIdx[j] == idx) {
						check =-1;
					}
				}
				
				if(check == 1) {
					e.myIdx[i] = idx;
					total += e.game[idx];							
				}else {
					i -= 1;
				}
			}
			
			if(e.total == total) {
				System.out.println("정답!");
				break;
			}
			else {
				System.out.println("땡!");
			}
		}
	}
}
