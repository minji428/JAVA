package day11;

import java.util.Random;
/*
 * # 1���� 5������ ���� ���ڸ� 2���� arr �迭�� �����ϱ�
 * ��) 1 3 2 1 4 4 5 2 3 5
 * �߰� ����) ���÷� ��������
 */

public class Ex13_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[10];
		int[] check = new int[6];
		
		int i=0;
		while(i<10) {
			//�������� 1~5���� ���ڸ� ������ �Է�
			int rNum = ran.nextInt(5)+1;
			//�켱 �迭�� ����
			arr[i] = rNum;
			
			//check�迭�� rNum�ε����� 0�̸� 1�� ����
			if(check[rNum] == 0) {
				check[rNum] = 1;
			}
			
			//check�迭�� rNum�ε����� 1�̸� 5�� ����
			else if(check[rNum] == 1) {
				check[rNum] = 5;
			}
			
			//check�迭�� rNum�ε����� 0�� 1�� �ƴϸ� i-=1
			//�ٽ� �ݺ��ϱ�
			else {
				i -= 1;
			}
			i+=1;
		}
		
		for(int kx = 0; kx<10; kx++) {
			System.out.print(arr[kx]+" ");
		}
		
	}
}
