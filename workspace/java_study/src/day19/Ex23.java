package day19;
//�ı� ���Ǳ� ���α׷� 		
//1) ������   2) ����� 
//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
//      2)�ڷΰ���
//���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
//ȭ�� 
//�ı� ���� : 3200�� 
//�ı� 	  : ??��  (������ ����) 
//50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
//1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? ��

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] money = {50000,10000,5000,1000,500,100};
		int[] charges = {1,1,1,1,5,10};
		
		int tickets = 5;
		int price = 3200;
		
		while(true) {
			System.out.println("[1]������");
			System.out.println("[2]�����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					
					if(choice == 1) {
						System.out.println("������ �ıǼ��� �Է��ϼ���. [���� : "+tickets);
						int count = scan.nextInt();
						tickets += count;
						System.out.println(tickets+"��ŭ �ı��� �����մϴ�.");
					}else if(choice==2) {
						while(true) {
							for(int i=0; i<money.length; i++) {
								System.out.println("["+i+". "+money[i]+"��]");
							}
							System.out.println();
							System.out.println("6.�ڷΰ���");
							int sel2 = scan.nextInt();
							if(sel2 == 6) {
								break;
							}else {
								charges[sel2]+=1;
								System.out.println(money[sel2]+"�� �����մϴ�.");
							}
						}
					}else if(choice==3) {
						break;
					}				
				}
			}else if(sel == 2) {
				while(true) {
					System.out.println("�ı� ���� : "+price+"��");
					System.out.println("�ı� �ż� : "+tickets+"��");
					for(int i=0; i<money.length;i++) {
						System.out.print("["+money[i]+"��]");
						System.out.println(charges[i]+"��");
					}
					
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					
					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if(choice==1) {
						System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
						int input_count[] = new int[6];
						int input_money = 0;
						
						while(true) {
							System.out.println("[1.������][2.�ϸ���][3.��õ��][4.��õ��]");
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
							System.out.println("�Ա��� �ݾ� : "+input_money);
						}
						if(input_money < price) {
							break;
						}
						System.out.println("�ı� �ż��� �Է��ϼ���.");
						int price_count = scan.nextInt();
						if(tickets < price_count) {
							break;
						}
						int price_total = (price_count * price);
						int result = input_money - price_total;
						
						if(result<0) {
							System.out.println("�Ա��� �ݾ��� �����ϴ�.");
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
								
								System.out.println("[�Ա� : "+input_money+"]"+
													"[�Ѿ� : "+price_total+"]"+
													"[�Ž����� : "+result+"]");
							}
							else {
								System.out.println("�ܵ��� �����մϴ�.");
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
