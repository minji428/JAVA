package day22;
/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� 6�� game �迭�� �����Ѵ�.
 * 2. 1���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
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
	
	// 1���� 10 ������ ���� �� 6���� �ߺ����� �����ϱ�
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
	
	// 0���� 5������ ���� �� 3���� �ߺ� ���� �����ϱ�
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
	
	// ���� �����(��)
	void setTotal() {
		for(int i=0; i<idx.length; i++) {
			total += game[idx[i]];
		}
	}
	
	// ���� ����ϱ�
	void printNumber() {
		System.out.print("[ ");
		for(int i=0; i<game.length; i++) {
			System.out.print(game[i]+" ");
		}
		System.out.println("]");
		
		System.out.println("�� = "+total);
	}
	
	// �ε��� �ߺ����� 3�� ��� �� ���ϱ�
	int choiceIdx() {
		for(int i=0; i<myIdx.length; i++) {
			System.out.print("�ε���"+(i+1)+" �Է� : ");
			int r = scan.nextInt();
			myIdx[i] = r;
			
			int check = 1;
			for(int j=0; j<i; j++) {
				if(myIdx[i] == myIdx[j]) {
					check =-1;
				}
			}
			if(check == -1) {
				System.out.println("���� �ߺ��˴ϴ�.");
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
		
		// ���� ���߱�
		while(true) {
			System.out.println("*�հ� ��ġ�ϵ��� ���� 3���� ��󺸼���!");
			printNumber();
			int myTotal = choiceIdx();
			
			// ���� Ȯ���ϱ�
			if(total == myTotal) {
				System.out.println("����!");
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
