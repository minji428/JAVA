package day03;

import java.util.Scanner;

/*
 * # ���θ� �ڷΰ���
 * 1. �����Ƿ�
 * 		1) Ƽ����
 * 		2) ����
 * 		3) �ڷΰ���
 * 2. �����Ƿ�
 * 		1) �����
 * 		2) ġ��
 * 		3) �ڷΰ���
 * 3. ����
 */
public class Ex20_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// c : ��(1) ����(0)
		// java : ��(true) ����(false)
		
		boolean run = true;
		while(run) {
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				boolean exit = true;
				
				while(exit) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");		
					
					System.out.print("�޴� ���� : ");
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
