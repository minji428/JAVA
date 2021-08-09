package day08;
/*
 * # 석차 출력
 * . 성적 순으로 이름 출력
 */

public class Ex06_2 {
	public static void main(String[] args) {
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
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
