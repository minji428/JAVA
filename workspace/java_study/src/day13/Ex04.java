package day13;
/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";

		
		while(true) {
			int size = start.length();
			System.out.println("제시어 : "+start);
			
			System.out.print("입력 : ");
			String myWord = scan.next();
			
			if(start.charAt(size-1) == myWord.charAt(0)) {
				start = myWord;
			}
			
//			if(myWord.equals("exit")) {
//				break;
//			}
		}
		
//		scan.close();
		
		//오류가 나는 이유는 Unreachable code 이기 때문에
		//while문이 끝나지 않는 코드라서
		//위에 주석 달아 놓은 if문을 함께 실행시키면 오류가 나지 않음
		
	}
}
