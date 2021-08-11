package day04_1;

import java.util.Random;

/*
 * # OMRī��
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

public class Ex03_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		for(int i = 0; i<5; i++) {
			hgd[i] = ran.nextInt(5)+1;
		}
		
		System.out.print("answer = [ ");
		for(int i = 0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("hgd = [ ");
		for(int i = 0; i<5; i++) {
			System.out.print(hgd[i]+" ");
		}
		System.out.println("]");
		
		int cnt = 0;
		int score = 0;
		System.out.print("����ǥ = [ ");
		for(int i = 0; i<5; i++) {
			if(answer[i]==hgd[i]) {
				System.out.print("O ");
				cnt +=1;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		score = cnt*20;
		System.out.println(score+"��");
	}
}
