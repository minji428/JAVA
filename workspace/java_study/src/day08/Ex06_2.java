package day08;
/*
 * # ���� ���
 * . ���� ������ �̸� ���
 */

public class Ex06_2 {
	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score = {87, 42, 100, 11, 98};
		
		for(int i=0; i<5; i++) {
			int maxNum = score[i];
			int maxIdx = i;
			for(int j=i; j<5; j++) {
				if(maxNum <score[j]) {
					maxNum = score[j];
					maxIdx = j;
				}
			}
			
			int scoreTemp = score[i];
			score[i] = score[maxIdx];
			score[maxIdx] = scoreTemp;
			
			String nameTemp = name[i];
			name[i] = name[maxIdx];
			name[maxIdx] = nameTemp;
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+" : "+score[i]);
		}
	}
}
