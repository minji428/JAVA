package day01;

public class Ex04_2 {
	public static void main(String[] args) {
		/* 1. 종류
		 * 1) &&(and)
		 * 2) ||(or)
		 * 
		 * 2. 역할
		 * 1) 논리 연산자를 통해 여러개의 비교연산자를 연결할 수 있다.
		 * 2) 논리 연산자를 통해 범위 설정이 가능하다.
		 */
		
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		
		System.out.println();
		
		//예) 3의 배수이면서, 짝수이면 true 출력
		int num = 12;
		System.out.println(num%3==0 & num%2==0);
		System.out.println();
		
		// 문제 1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면, false
		int kor = 100;
		int eng = 87;
		int math = 41;
		int total = kor+eng+math;
		int avg = total/3;
		System.out.println(avg>=60 && kor>=50 && eng>=50 && math>=50);
		System.out.println();
		
		// 문제2) 키가 200cm이상이거나 몸무게가 200kg이상이면, 입장(true)
		int height1 = 199;
		int weight1 = 199;
		System.out.println(height1>=200 || weight1>=200);
		
		int height2 = 200;
		int weight2 = 68;
		System.out.println(height2>=200 || weight2>=200);
		System.out.println();
		
		
		
	}
}
