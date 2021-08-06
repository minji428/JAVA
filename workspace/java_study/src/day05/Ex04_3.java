package day05;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {0, 1, 0, 0, 0}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {0, 1, 0, 1, 0}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {0, 1, 1, 1, 0}
 * arr   = {1, 3, 2, 0, 0}
 */
public class Ex04_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		/* 랜덤숫자를 입력받고  arr의 첫번째 자리에 숫자를 집어 넣는다.
		 * check번째의 idx위치가 0이면 다음순서로
		 * 만약 1이면 i를 -1빼서 다시 입력한다(중복금지)
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

