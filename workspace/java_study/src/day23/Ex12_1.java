package day23;
/*
 * # static 변수와 멤버 변수
 * 1. static 변수
 * 1) 선언 위치 : 클래스 영역
 * 2) 작성 방법 : 변수의 자료형 앞에 static 작성
 * 3) 형       태 : 파란색의 이텔릭체
 * 4) 사용법 1 : 클래스명.변수명
 * 5) 사용법 2 : new를 통해 변수 생성 후, 그 이름으로 사용
 * 
 * 2. 멤버 변수
 * 1) 선언 위치 : 클래스 영역
 * 2) 작성 방법 : 일반 변수와 동일하게 작성
 * 3) 형       태 : 파란색
 * 4) 사  용  법 : new를 통해 변수 생성 후, 그 이름으로 사용
 *  
 * 3. 공통점
 * 클래스 영역에 선언하는 변수는 자동으로 값이 초기화된다. 
 */

public class Ex12_1 {
	static int x = 3;
		   int y = 2;
		   int z;

	public static void main(String[] args) {
		System.out.println("static 변수 = "+Ex12_1.x);
		
		Ex12_1 e = new Ex12_1();
		System.out.println("멤버 변수 = "+e.y);
		Ex12_1 e1 = new Ex12_1();
		System.out.println("멤버 변수 = "+e1.y);
		
		
	}
}
