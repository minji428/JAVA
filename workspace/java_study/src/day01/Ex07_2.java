package day01;

import java.util.Scanner;

/*
 * # ������ ����[1�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class Ex07_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int x = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int y = scan.nextInt();
		
		int answer = x*y;
		System.out.print("���� �Է� : ");
		int myanswer = scan.nextInt();
		
		if(answer==myanswer) {
			System.out.println("����!");
		}
		else {
			System.out.println("��!");
		}
	}
}
