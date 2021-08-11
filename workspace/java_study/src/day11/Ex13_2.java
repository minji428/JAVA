package day11;
/*
 * # 소수 찾기[3단계]
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 */

import java.util.Scanner;

public class Ex13_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number? ");
		int number = scan.nextInt();
		
		//i는 number+1부터 시작해서 number의 number제곱까지 구한다
		for(int i=number+1; i<number*number; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.print(i);
				break;
			}
			
		}
		
		scan.close();
	}

}
