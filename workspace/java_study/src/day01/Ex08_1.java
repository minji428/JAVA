package day01;

import java.util.Scanner;

/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�.
 */
public class Ex08_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		
		if(60<=score && score<=100) {
			System.out.println("�հ�");
		}
		if(0<=score && score <60) {
			System.out.println("���հ�");
		}
		if(100<score || score<0) {
			System.out.println("������ �߸� �Է��߽��ϴ�");
		}
	}
}
