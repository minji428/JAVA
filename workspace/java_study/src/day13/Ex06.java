package day13;
/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		System.out.print("���� �̸��� �Է��ϼ���  : ");
		String myname = scan.next();
		
		int check = -1;
		if(name.length() == myname.length()) {
			check = 1;
			for(int i=0; i<name.length(); i++) {
				if(name.charAt(i)!=myname.charAt(i)) {
					check = -1;
				}
			}
		}
		if(check == 1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}
