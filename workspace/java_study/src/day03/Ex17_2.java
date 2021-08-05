package day03;
/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */

import java.util.Scanner;

public class Ex17_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("입금 할 금액 입력 : ");
				int money = scan.nextInt();
				
				myMoney = myMoney+money;
				System.out.println("입금을 완료하였습니다");
			}
			else if(sel==2) {
				System.out.print("출금 할 금액 입력 : ");
				int money = scan.nextInt();
				if(myMoney>=money) {
					myMoney = myMoney - money;
					System.out.println("출금을 완료하였습니다");
				}
				else {
					System.out.println("계좌잔액이 부족합니다");
				}
			}
			else if(sel==3) {
				System.out.print("이체 할 계좌번호 입력 : ");
				int acc = scan.nextInt();
				System.out.println("이체 할 금액 입력 : ");
				int money = scan.nextInt();
				
				if(money <=myMoney) {
					myMoney = myMoney - money;
					yourMoney = yourMoney + money;
					System.out.println("이체를 완료하였습니다");
				}
				else {
					System.out.println("계좌 잔액이 부족합니다");
				}
			}
			else if(sel==4) {
				System.out.println("myMoney = "+myMoney+"원");
				System.out.println("yourMoney = "+yourMoney+"원");
			}
			else if(sel==0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}
}
