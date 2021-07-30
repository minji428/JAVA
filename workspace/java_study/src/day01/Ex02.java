package day01;

public class Ex02 {
	public static void main(String[] args) {
		
		// 정수 / 정수 = 정수
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10%3);
		System.out.println();
		
		// 연결 연산자
		// 1) "문자"+"문자" = "문자"
		System.out.println("안녕"+"하세요");
		// 2) 숫자+"문자" = "문자"
		System.out.println("10"+3);
		// 3) "문자"+숫자 = "문자"
		System.out.println(3+"10");
		
		System.out.println("더하기 = "+10+3);
		System.out.println("더하기 = "+(10+3));
		System.out.println();
		
		// 예) 현금이 1000원 있다. 200원짜리 과자 구입 후, 잔돈 출력
		System.out.println(1000-200);
		System.out.println("잔돈 = "+(1000-200)+"원");
		System.out.println();
		
		// 문제1) 월급이 100원이다. 연봉은? (조건:세금 10%제외)
		System.out.println((100*12)*0.9);
		System.out.println("연봉 = "+(100*12*0.9)+"원");
		System.out.println();
		
		// 문제2) 시험점수를 30, 50, 4점을 받았다. 평균은?
		System.out.println((30+50+4)/3);
		System.out.println("평균 = "+(30+50+4)/3+"점");
		System.out.println();
		
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println((3*6)/2.0);
		System.out.println("넓이 = "+(3*6)/2.0);
		System.out.println();
		
		// 문제4) 100초를 1분 40초로 출력
		System.out.println(100/60);
		System.out.println(100%60);
		System.out.println(100/60+"분 "+100%60+"초");
		System.out.println();
		
		// 문제5) 800원에서 500원짜리 개수, 100원짜리 개수 출력
		System.out.println(800/500);
		System.out.println(800%500/100);
		System.out.println("500원 = "+800/500+"개");
		System.out.println("100원 = "+800%500/100+"개");
		System.out.println();
		
		
		/* 대입 연산자
		 * 변수는 오직 대입 연산자를 통해서만이
		 * 값의 변경이 가능하다.
		 */
		
		int num = 8;
		System.out.println(num+1);
		System.out.println(num);
		
		num = num+1;
		System.out.println(num);

		
	}
}
