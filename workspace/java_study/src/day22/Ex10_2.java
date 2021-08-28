package day22;
/*
 * # 더하기 게임
 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 6개 game 배열에 저장한다.
 * 2. 1부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
 */

import java.util.Random;
import java.util.Scanner;

class PlusGame{
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	
	int total = 0;
	
	// 1부터 10 사이의 랜덤 값 6개를 중복없이 저장하기
	void setNumber() {
		for(int i=0; i<game.length; i++) {
			int r = ran.nextInt(10)+1;
			game[i] = r;
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(game[i] == game[j]) {
					check =-1;
				}
			}
			if(check == -1) {
				i -= 1;
			}
		}
	}
	
	// 0부터 5사이의 랜덤 값 3개를 중복 없이 저장하기
	void setIdx() {
		for(int i=0; i<idx.length; i++) {
			int r = ran.nextInt(6);
			idx[i] = r;
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(game[i] == game[j]) {
					check =-1;
				}
			}
			if(check == -1) {
				i -= 1;
			}
		}
	}
	
	// 문제 만들기(합)
	void setTotal() {
		for(int i=0; i<idx.length; i++) {
			total += game[idx[i]];
		}
	}
	
	// 숫자 출력하기
	void printNumber() {
		System.out.print("[ ");
		for(int i=0; i<game.length; i++) {
			System.out.print(game[i]+" ");
		}
		System.out.println("]");
		
		System.out.println("합 = "+total);
	}
	
	// 인덱스 중복없이 3개 골라 합 구하기
	int choiceIdx() {
		for(int i=0; i<myIdx.length; i++) {
			System.out.print("인덱스"+(i+1)+" 입력 : ");
			int r = scan.nextInt();
			myIdx[i] = r;
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(myIdx[i] == myIdx[j]) {
					check =-1;
				}
			}
			if(check == -1) {
				System.out.println("값이 중복됩니다.");
				i -= 1;
			}
			
		}
		int myTotal = 0;
		for(int i=0; i<myIdx.length; i++) {
			myTotal += game[myIdx[i]];
		}
		
		return myTotal;
	}
	
	void run() {
		setNumber();
		setIdx();
		setTotal();
		
		// 정답 맞추기
		while(true) {
			System.out.println("*합과 일치하도록 숫자 3개를 골라보세요!");
			printNumber();
			int myTotal = choiceIdx();
			
			// 정답 확인하기
			if(total == myTotal) {
				System.out.println("정답!");
				break;
			}
		}
	}
}

public class Ex10_2 {
	public static void main(String[] args) {
		PlusGame pg = new PlusGame();
		pg.run();
	}
}
