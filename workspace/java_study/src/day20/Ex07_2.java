package day20;
/*
 * # ���ϱ� ����
 * 1. 1���� 10 ������ ������ ���� �ߺ� ���� game �迭�� 6�� �����Ѵ�.
 * 2. 0���� 5������ ���� �� 3���� �ߺ� ���� ������ �� ���� ���� ����Ѵ�. 
 * 3. ����ڴ� �ߺ����� 3���� �ε����� ��� �� ���� ���ߴ� �����̴�.
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
			
			// �ߺ�Ȯ��
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
		System.out.println("\t[���ϱ� ����]");
		System.out.print("����ī�� >>>");
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
		System.out.println("ġƮŰ >>>");
		for(int i=0; i<e.idx.length; i++) {
			System.out.print(e.idx[i]+" ");
		}
		System.out.println();
		System.out.println("�� = "+e.total);
		
		while(true) {
			
			int total = 0;
			
			for(int i=0; i<e.myIdx.length; i++) {
				System.out.print((i+1)+".�ε��� �Է� : ");
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
				System.out.println("����!");
				break;
			}
			else {
				System.out.println("��!");
			}
		}
	}
}
