package day03;
/*
 * # ATM[2�ܰ�]
 * 1. �Ա�
 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
 * 2. ���
 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3. ��ü
 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
 * . ��ü �� yourMoney �ܾ� ����
 * 4. ��ȸ
 * . myMoney�� yourMoney �ܾ� ��� ���
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
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("�Ա� �� �ݾ� �Է� : ");
				int money = scan.nextInt();
				
				myMoney = myMoney+money;
				System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�");
			}
			else if(sel==2) {
				System.out.print("��� �� �ݾ� �Է� : ");
				int money = scan.nextInt();
				if(myMoney>=money) {
					myMoney = myMoney - money;
					System.out.println("����� �Ϸ��Ͽ����ϴ�");
				}
				else {
					System.out.println("�����ܾ��� �����մϴ�");
				}
			}
			else if(sel==3) {
				System.out.print("��ü �� ���¹�ȣ �Է� : ");
				int acc = scan.nextInt();
				System.out.println("��ü �� �ݾ� �Է� : ");
				int money = scan.nextInt();
				
				if(money <=myMoney) {
					myMoney = myMoney - money;
					yourMoney = yourMoney + money;
					System.out.println("��ü�� �Ϸ��Ͽ����ϴ�");
				}
				else {
					System.out.println("���� �ܾ��� �����մϴ�");
				}
			}
			else if(sel==4) {
				System.out.println("myMoney = "+myMoney+"��");
				System.out.println("yourMoney = "+yourMoney+"��");
			}
			else if(sel==0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		scan.close();
	}
}
