package day01;

import java.util.Scanner;

public class Ex07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * # �α���[1�ܰ�]
		 * 1. Id�� Pw�� �Է¹޴´�.
		 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID �Է� : ");
		int myID = scan.nextInt();
		System.out.print("PW �Է� : ");
		int myPW = scan.nextInt();
		
		if(dbId==myID && dbPw==myPW) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
		System.out.println();
		System.out.println();
		
		/*
		 * # �α���[2�ܰ�]
		 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
		 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
		 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		int dbId1 = 0;
		int dbPw1 = 0;
		System.out.println("==== ȸ�� ���� ====");
		System.out.print("������ ID�� �Է��ϼ��� : ");
		dbId1=scan.nextInt();
		System.out.print("������ PW�� �Է��ϼ��� : ");
		dbPw1 = scan.nextInt();
		
		System.out.print("�α��� �� ID�� �Է��ϼ��� : ");
		int myID1 = scan.nextInt();
		System.out.print("�α��� �� PW�� �Է��ϼ��� : ");
		int myPW1 = scan.nextInt();
		
		if(dbId1==myID1 && dbPw1==myPW1) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
	}
}
