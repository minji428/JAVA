package day03;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 */
public class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log==-1) {
					System.out.print("���¹�ȣ �Է� : ");
					int myAcc = scan.nextInt();
					System.out.print("��й�ȣ �Է� :");
					int myPw = scan.nextInt();
				
					if(myAcc == dbAcc1 && myPw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1+"��, ȯ���մϴ�");
					}
					else if(myAcc == dbAcc2 && myPw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2+"��, ȯ���մϴ�");
					}
					else {
						if(log==1) {
							System.out.println("���� "+dbAcc1+"��, �α��� ��...");
						}
						else if(log==2) {
							System.out.println("���� "+dbAcc2+"��, �α��� ��...");
						}
					}
				}
				
			}
			else if(sel==2) {
				if(log!=-1) {
					log=-1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				}
				else {
					System.out.println("�α��� �� �̿����ּ���");
				}
			}
			else if(sel==0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		scan.close();
	}
}
