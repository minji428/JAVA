package day11;

import java.util.Random;
/*
 * # 1부터 5사이의 랜덤 숫자를 2개씩 arr 배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 5
 * 추가 조건) 셔플로 하지말것
 */

public class Ex13_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[10];
		int[] check = new int[6];
		
		int i=0;
		while(i<10) {
			//랜덤으로 1~5까지 숫자만 나오게 입력
			int rNum = ran.nextInt(5)+1;
			//우선 배열에 저장
			arr[i] = rNum;
			
			//check배열의 rNum인덱스가 0이면 1로 변경
			if(check[rNum] == 0) {
				check[rNum] = 1;
			}
			
			//check배열의 rNum인덱스가 1이면 5로 변경
			else if(check[rNum] == 1) {
				check[rNum] = 5;
			}
			
			//check배열의 rNum인덱스가 0과 1이 아니면 i-=1
			//다시 반복하기
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
