package day04_1;

import java.util.Random;

/*
 * # �л��������� ���α׷�[1�ܰ�] : �л�����
 */

public class Ex02_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i = 0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int tot = 0;
		int avg = 0;
		for(int i = 0; i<5; i++) {
			tot = arr[i]; 
		}
		avg = tot/5;
		System.out.println(tot);
		System.out.println(avg);
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		int cnt = 0;
		for(int i = 0; i<5; i++) {
			if(arr[i]>=60) {
				cnt += 1;
			}
		}
		System.out.println(cnt+"��");
		

	}
}
