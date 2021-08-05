package day02;
/*
 * # 반복문 while
 * 1. 반복문의 조건 3가지
 * 1) 초기식
 * 2) 조건식
 * 3) 증감식
 * 
 * 2. 구조
 * 초기식;
 * while(조건식){
 * 		조건식이 참일 동안 실행할 문장;
 * 		증감식;
 * }
 */

public class Ex15_1 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i=i+1;
		}
		
		// 문제1) 1~10까지 반복해 5~9 출력
		i = 1;
		while(i<=10) {
			if(5<=i && i<=9) {
				System.out.print(i+" ");
			}
			i=i+1;
		}
		System.out.println();
		
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		i = 10;
		while(i>=1) {
			if(3<=i && i<=6) {
				System.out.print(i+" ");
			}
			i-=1;
		}
		System.out.println();
		
		// 문제3) 1~10까지 반복해 짝수만 출력
		i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		
		// 문제1) 1~5까지의 합 출력
		i = 1;
		int total = 0;
		while(i<=5) {
			total = total+i;
			i++;
		}
		System.out.println(total);
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		i = 1;
		while(i<=10) {
			if(i<3 || 7<=i) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		i = 1;
		total = 0;
		while(i<=10) {
			if(i<3 || 7<=i) {
				total = total +i;
			}
			i++;
		}
		System.out.println(total);
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		int cnt = 0;
		i = 1;
		while(i<=10) {
			if(i<3 || 7<=i) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
	}
}
