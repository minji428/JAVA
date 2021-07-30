package day01;

public class Ex03_1 {
	public static void main(String[] args) {
		/* 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
		 * 2. 변수의 선언 : int a;
		 * 3. 변수의 초기화 : a = 10;
		 */
		
		//1. 정수 : integer
		int num;
		num = 10;
		System.out.println(num);
		
		//2. 실수 : double
		double dNum = 3.14;
		System.out.println(dNum);
		
		//3. 문자 한 개 : character
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '가';
		System.out.println(c2);
		
		//4. 문자 여러개 : String
		String str = "java";
		System.out.println(str);
		
		//5. 참과 거짓 : boolean
		boolean result = true;
		System.out.println(result);
		
		System.out.println();
		
		//예) 현금이 1000원 있다. 200원짜리 과자 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = "+잔돈+"원 ");
		System.out.println();
		
		//문제1) 월급이 100원이다. 연봉은? (조건:세금10% 제외)
		int 월급 = 100;
		int 세전연봉 = 월급*12;
		int 세금 = 세전연봉/10;
		int 세후연봉 = 세전연봉 - 세금;
		System.out.println("세후연봉 = "+세후연봉+"원");
		System.out.println();
		
		//문제2) 시험점수를 30, 50, 4 점을 받았다. 평균은?
		int sc1 = 30;
		int sc2 = 50;
		int sc3 = 4;
		int total = sc1+sc2+sc3;
		double avg = total/3.0;
		System.out.println("평균 = "+avg+"점");
		System.out.println();
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int width = 3;
		int height = 6;
		double triArea = width*height/2.0;
		System.out.println("삼각형의 넓이 = "+triArea);
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int minutes = time/60;
		int seconds = time%60;
		System.out.println(minutes+"분 "+seconds+"초");
		System.out.println();
		
		//문제5) 800원에서 500원짜리 개수, 100원짜리 개수
		int money = 800;
		int fivHund = money/500;
		int oneHund = money%500/100;
		System.out.println("500원의 개수 = "+fivHund);
		System.out.println("100원의 개수 = "+oneHund);
		System.out.println();
		
		
		/* 변수의 명명규칙
		 * 1. 숫자로 시작할 수 없다.
		 * 2. 특수문자는 _, $만 허용한다.
		 * 3. 예약어(키워드)는 사용할 수 없ㄷ다.
		 * ex) public, class, static, void...
		 * 4. 자바는 알파벳의 대소문자를 구분한다.
		 * -------------------------------
		 * 1. 패키지명, 변수명은 소문자로 시작한다.
		 * 2. 클래스명은 대문자로 시작한다.
		 */
		
		int test = 1;
		int Test = 2;
		System.out.println(test);
		System.out.println(Test);
		
		int $money =1000;
		int curPos = -1;		//현재위치(current position)
		System.out.println();
		
		
		/* 변수의 특징
		 * 1. 변수는 값을 한개만 저장할 수 있다.
		 * 2. 때문에 새로운 값이 저장되면 이전의 값은 사라진다.
		 * 3. 같은 이름의 변수를 사용할 수 없다.
		 */
		
		int num1 = 10;	//num = 10
		num1 = 9;		//num = 9
		num1 = 3;		//num = 3
		System.out.println(num1);		//num = 3
		System.out.println();
		
	
	}
}
