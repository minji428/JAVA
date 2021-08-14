package day13;

/*
 * 	# c언어
 * 	1. 자료형
 * 		1) String 존재 X => char배열
 * 		2) 참(1), 거짓(0)
 *  2. 함수형태
 *  3. 구조체 ( 변수 ) + 함수
 *  4. 배열
 * 		1) (길이가 고정인)배열
 * 			. stack 생성
 * 			. int arr[3];
 * 		2) (길이가 가변인)배열
 * 			. heap 생성
 * 			. int size = 3;
 * 			. int* p = new int[size];
 *  5. 주소변수
 *  	int num = 10;
 *  	int* p = &num;
 * 
 * 	# java언어
 *  1. 자료형
 *  	1) String
 * 		2) 참(true), 거짓(false)
 *  2. 클래스 = 메서드(함수) + 변수
 *  3. 배열
 * 		1) (길이가 가변인)배열
 * 			. heap 생성
 * 			. int size = 3;
 * 			. int[] arr = new int[size];
 *  4. 주소변수
 *  	1) 배열
 *  	2) 클래스
 *  5. 자바는 heap 생성되는 메모리들은 값이 자동 초기화된다.
 *  	* 배열 & 클래스
 *  	1) 정수 : 0
 *  	2) 실수 : 0.0
 *  	3) 클래스 : null
 */

class Student {
	String name;
	int age;
}

public class Ex00 {
	public static void main(String[] args) {
		
		double[] arr = new double[3];
		System.out.println(arr);			// [D@7852e922
		
		System.out.println(arr[0]);
		
		Student hgd = new Student();
		System.out.println(hgd);			// day13.Student@4e25154f
		System.out.println(hgd.age);
		System.out.println(hgd.name);
	}
}
