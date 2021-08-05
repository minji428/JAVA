package day03;

import java.util.Scanner;

/*
 * # 쇼핑몰 뒤로가기
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */
public class Ex20_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// c : 참(1) 거짓(0)
		// java : 참(true) 거짓(false)
		
		boolean run = true;
		while(run) {
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				boolean exit = true;
				
				while(exit) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");		
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice ==1) {}
					else if(choice ==2) {}
					else if(choice ==3) {
						exit = false;
					}
				}
			}
		}
		
		scan.close();
	}
}
