package day08;
/*
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1�����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */
public class Ex06_1 {
	public static void main(String[] args) {
		
		int[] score = {10,50,30,40,80,7};
		
		for(int i = 0; i<6; i++) {
			int maxNum = score[i];
			int maxIdx = i;
			for(int j = i; j<6; j++) {
				if(maxNum<score[j]) {
				maxNum = score[j];
				maxIdx = j;
				}
			}
			int temp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = temp;
		}
		for(int i =0; i<6; i++) {
			System.out.print(score[i]+" ");
		}
	}
}
