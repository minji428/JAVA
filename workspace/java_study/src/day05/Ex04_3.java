package day05;

import java.util.Random;

/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
public class Ex04_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		/* �������ڸ� �Է¹ް�  arr�� ù��° �ڸ��� ���ڸ� ���� �ִ´�.
		 * check��°�� idx��ġ�� 0�̸� ����������
		 * ���� 1�̸� i�� -1���� �ٽ� �Է��Ѵ�(�ߺ�����)
		*/
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int i = 0;
		while(i<5) {
			int r = ran.nextInt(5);
			arr[i] = r;
			if(check[r]==0) {
				check[r] = 1;
			}
			else {
				i-=1;
			}
			i++;
		}
		for(int j = 0; j<5; j++) {
			System.out.print(arr[j]+ " ");
		}
		
		
		
	/*	for(int i = 0; i<5; i++) {
			int r = ran.nextInt(5);
			arr[i] = r;
			if(check[r]==0) {
				check[r] = 1;
			}
			else {
				i-=1;
			}
		}
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+ " ");
		}
		*/
	}
}

