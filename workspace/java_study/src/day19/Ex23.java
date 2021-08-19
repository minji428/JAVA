package day19;
//식권 자판기 프로그램 		
//1) 관리자   2) 사용자 
//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
//      2)뒤로가기
//조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
//화면 
//식권 가격 : 3200원 
//식권 	  : ??매  (매진시 매진) 
//50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
//1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money = {50000,10000,5000,1000,500,100};
		int[] charges = {1,1,1,1,5,10};
		
		int tickets = 5;
		int price = 3200;
		
		while(true) {
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("충전할 식권수를 입력하세요. [현재 : "+tickets);
						int count = scan.nextInt();
						tickets += count;
						System.out.println(tickets+"만큼 식권을 충전합니다.");
					}else if(choice==2) {
						while(true) {
							for(int i=0; i<money.length; i++) {
								System.out.println("["+i+". "+money[i]+"원]");
							}
							System.out.println();
							System.out.println("6.뒤로가기");
							int sel2 = scan.nextInt();
							if(sel2 == 6) {
								break;
							}else {
								charges[sel2]+=1;
								System.out.println(money[sel2]+"을 충전합니다.");
							}
						}
					}else if(choice==3) {
						break;
					}				
				}
			}else if(sel == 2) {
				while(true) {
					System.out.println("식권 가격 : "+price+"원");
					System.out.println("식권 매수 : "+tickets+"매");
					for(int i=0; i<money.length;i++) {
						System.out.print("["+money[i]+"원]");
						System.out.println(charges[i]+"매");
					}
					
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice==1) {
						System.out.println("입금할 금액을 입력하세요.");
						int input_count[] = new int[6];
						int input_money = 0;
						
						while(true) {
							System.out.println("[1.오만원][2.일만원][3.오천원][4.일천원]");
							int num = scan.nextInt();
							if(num==0) {
								break;
							}else {
								input_count[num-1]+=1;
							}
							input_money = 0;
							for(int i=0; i<6; i++) {
								input_money += input_count[i] * money[i];
							}
							System.out.println("입금한 금액 : "+input_money);
						}
						if(input_money < price) {
							break;
						}
						System.out.println("식권 매수를 입력하세요.");
						int price_count = scan.nextInt();
						if(tickets < price_count) {
							break;
						}
						int price_total = (price_count * price);
						int result = input_money - price_total;
						
						if(result<0) {
							System.out.println("입금한 금액이 적습니다.");
						}else {
							int check_charge[] = new int[6];
							for(int i=0; i<6; i++) {
								check_charge[i] = charges[i];
							}
							int result_check = result;
							for(int i=0; i<6; i++) {
								int check_run = 1;
								while(check_run == 1) {
									if(result_check>=money[i] && check_charge[i]>0) {
										result_check -= money[i];
										check_charge[i] -= 1;
									}else {
										check_run = 0;
										break;
									}
								}
							}
							if(result_check == 0) {
								for(int i=0; i<6; i++) {
									charges[i] = check_charge[i];
									charges[i] += input_count[i];
								}
								tickets -= price_count;
								
								System.out.println("[입금 : "+input_money+"]"+
													"[총액 : "+price_total+"]"+
													"[거스름돈 : "+result+"]");
							}
							else {
								System.out.println("잔돈이 부족합니다.");
							}
						}
						
					}else if(choice==2) {
						break;
					}
				}
			}
			scan.close();
		}
	}
}
