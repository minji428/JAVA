package day09;
/*
 * # ��÷���� 1��Ʈ
 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
 * 2. �������� 5���� ������ �����ϵ�,
 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
 */

import java.util.Random;

public class Ex12_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];
		
		int win = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				int r = ran.nextInt(2);
				if(r == 1) {
					lottoSet[i][j] = 3;
				}
				else {
					lottoSet[i][j] = 0;
				}
			}
			
			int check =-1;
			int cnt = 0;
			for(int j=0; j<7; j++) {
				if(lottoSet[i][j] == 3) {
					cnt += 1;
				}
				else {
					cnt = 0;
				}
				if(cnt == 3) {
					check = 1;
				}
			}
			
			if(check == 1 && win == 0) {
				win = 1;
			}
			else if(check == 1 && win == 1) {
				i -=1;
			}
			else if(check == -1 && win == 0) {
				i -= 1;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				System.out.print(lottoSet[i][j]+" ");
			}
			System.out.println();
		}

	}
}
