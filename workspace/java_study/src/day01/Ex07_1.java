package day01;

import java.util.Scanner;

public class Ex07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * # 로그인[1단계]
		 * 1. Id와 Pw를 입력받는다.
		 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID 입력 : ");
		int myID = scan.nextInt();
		System.out.print("PW 입력 : ");
		int myPW = scan.nextInt();
		
		if(dbId==myID && dbPw==myPW) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		System.out.println();
		System.out.println();
		
		/*
		 * # 로그인[2단계]
		 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
		 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
		 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		int dbId1 = 0;
		int dbPw1 = 0;
		System.out.println("==== 회원 가입 ====");
		System.out.print("가입할 ID를 입력하세요 : ");
		dbId1=scan.nextInt();
		System.out.print("가입할 PW를 입력하세요 : ");
		dbPw1 = scan.nextInt();
		
		System.out.print("로그인 할 ID를 입력하세요 : ");
		int myID1 = scan.nextInt();
		System.out.print("로그인 할 PW를 입력하세요 : ");
		int myPW1 = scan.nextInt();
		
		if(dbId1==myID1 && dbPw1==myPW1) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}
