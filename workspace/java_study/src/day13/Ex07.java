package day13;
/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 */

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String text = scan.next();
		
		char[] charnum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		int cnt = 0;
		for(int i=0; i<charnum.length; i++) {
			for(int j=0; j<text.length(); j++) {
				if(charnum[i] == text.charAt(j)) {
					cnt += 1;
				}
			}
		}
		if(cnt == text.length()) {
			System.out.println("���ڸ� �ִ�");
		}
		else if(cnt == 0) {
			System.out.println("���ڸ� �ִ�");
		}
		else {
			System.out.println("���ڿ� ���ڰ� ���� �ִ�");
		}
		
		scan.close();
	}
	
}
