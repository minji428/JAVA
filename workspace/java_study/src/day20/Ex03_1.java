package day20;
/*
 * # OMRī�� : Ŭ���� + ����
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

import java.util.Random;

class Ex06{
	int[] answer = {1,3,4,2,5};	// ������
	int[] hgd = new int[5];	// �л� ���
	
	int cnt = 0;	// ���� ���� ����
	int score = 0;	// ����
}

public class Ex03_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		Ex06 e = new Ex06();
		for(int i=0; i<e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5)+1;
		}
		System.out.print("��    �� : ");
		for(int i=0; i<e.answer.length; i++) {
			System.out.print(e.answer[i]+" ");
		}
		System.out.println();
		
		System.out.print("�л� �� : ");
		for(int i=0; i<e.hgd.length; i++) {
			System.out.print(e.hgd[i]+" ");
		}
		System.out.println();
		
		System.out.print("����ǥ : ");
		for(int i=0; i<e.hgd.length; i++) {
			if(e.answer[i] == e.hgd[i]) {
				e.cnt += 1;
				System.out.print("O ");
			}else {
				System.out.print("X ");
			}
		}
		System.out.println();
		
		e.score = e.cnt * 20;
		System.out.print("���� = "+e.score+"��");
	}
}
