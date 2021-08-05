package day03;

import java.util.Scanner;

/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 * 3. �Ա�
 * . �α��� �� �̿밡��
 * 4. ���
 * . �α��� �� �̿밡��
 * 5. ��ü
 * . �α��� �� �̿밡��
 * 6. ��ȸ
 * . �α��� �� �̿밡��
 * 7. ����
 */
public class Ex17_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int log = -1;
		// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		boolean run = true;
		while(run) {
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log ==-1) {
					System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
					int myAcc = scan.nextInt();
					System.out.print("��й�ȣ�� �Է��ϼ��� : ");
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
						System.out.println("���¹�ȣ�� Ȯ�����ּ���");
					}
				}
			}
			else if(sel == 2) {
				if(log!=-1) {
					log =-1;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				}
				else {
					System.out.println("�α��� �� �̿����ּ���");
				}
			}
			else if(sel == 3) {
				if(log!=-1) {
					if(log==1) {
						System.out.print("�Ա� �� �ݾ��� �Է����ּ��� : ");
						int money = scan.nextInt();
						dbMoney1 = dbMoney1 + money;
						System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�");
					}
					else if(log==2) {
						System.out.print("�Ա� �� �ݾ��� �Է����ּ��� : ");
						int money = scan.nextInt();
						dbMoney2 = dbMoney2 + money;
						System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�");
					}
					else {
						System.out.println("�α��� �� �̿����ּ���");
					}
				}
			}
			else if(sel == 4) {
				if(log!=-1) {
					System.out.print("����� �ݾ��� �Է����ּ��� : ");
					int money = scan.nextInt();
					
					if(log==1) {
						if(money<=dbMoney1) {
							dbMoney1 = dbMoney1 - money;
							System.out.println("����� �Ϸ��Ͽ����ϴ�");
						}
						else {
							System.out.println("�����ܾ��� �����մϴ�");
						}
					}
					else if(log==2) {
						if(money<=dbMoney2) {
							dbMoney2 = dbMoney2 - money;
							System.out.println("����� �Ϸ��Ͽ����ϴ�");
						}
						else {
							System.out.println("�����ܾ��� �����մϴ�");
						}
					}
				}
				else {
					System.out.println("�α��� �� �̿����ּ���");
				}
			}
			else if(sel==5) {
				if(log!=-1) {
					System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
					int acc = scan.nextInt();
					
					if(log==1) {
						if(acc==dbAcc2) {
							System.out.print("��ü�� �ݾ� �Է� : ");
							int money = scan.nextInt();
							
							if(money <=dbMoney1) {
								dbMoney1 = dbMoney1 - money;
								dbMoney2 = dbMoney2 + money;
								System.out.println("��ü�� �Ϸ��Ͽ����ϴ�");
							}
							else {
								System.out.println("�����ܾ��� �����մϴ�");
							}
						}
						else {
							System.out.println("���¹�ȣ�� Ȯ�����ּ���");
						}
					}
					else if(log==2) {
						if(acc == dbAcc1) {
							System.out.print("��ü�� �ݾ� �Է� : ");
							int money = scan.nextInt();
							
							if(money <=dbMoney2) {
								dbMoney2 = dbMoney2 - money;
								dbMoney1 = dbMoney1 + money;
								System.out.println("��ü�� �Ϸ��Ͽ����ϴ�");
							}
							else {
								System.out.println("�����ܾ��� �����մϴ�");
							}
						}
						else {
							System.out.println("���¹�ȣ�� Ȯ�����ּ���");
						}
					}
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�");
				}
			}
			else if(sel==6) {
				if(log!=-1) {
					System.out.println("dbMoney1 = "+dbMoney1 + "��");
					System.out.println("dbMoney2 = "+dbMoney2 + "��");
				}
				else {
					System.out.println("�α��� �� �̿밡���մϴ�");
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
