package day13;
/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "������";

		
		while(true) {
			int size = start.length();
			System.out.println("���þ� : "+start);
			
			System.out.print("�Է� : ");
			String myWord = scan.next();
			
			if(start.charAt(size-1) == myWord.charAt(0)) {
				start = myWord;
			}
			
//			if(myWord.equals("exit")) {
//				break;
//			}
		}
		
//		scan.close();
		
		//������ ���� ������ Unreachable code �̱� ������
		//while���� ������ �ʴ� �ڵ��
		//���� �ּ� �޾� ���� if���� �Բ� �����Ű�� ������ ���� ����
		
	}
}
