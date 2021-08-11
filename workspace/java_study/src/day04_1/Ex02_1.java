package day04_1;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

public class Ex02_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		// 문제1) arr배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for(int i = 0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int tot = 0;
		int avg = 0;
		for(int i = 0; i<5; i++) {
			tot = arr[i]; 
		}
		avg = tot/5;
		System.out.println(tot);
		System.out.println(avg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for(int i = 0; i<5; i++) {
			if(arr[i]>=60) {
				cnt += 1;
			}
		}
		System.out.println(cnt+"명");
		

	}
}
