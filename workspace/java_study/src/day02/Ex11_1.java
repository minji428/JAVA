package day02;

import java.util.Random;
import java.util.Scanner;
/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ����� ���� ���ڸ� �����ְ�,
 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */

public class Ex11_1 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int rNum = ran.nextInt(100)+1;
		System.out.println("���� : "+rNum);
		
		System.out.println("1.¦��");
		System.out.println("2.Ȧ��");		
		
		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = scan.nextInt();
		
		if(choice==1) {
			if(rNum%2==0) {
				System.out.println("����!");
			}
			else {
				System.out.println("����");
			}
		}
		if(choice==2) {
			if(rNum%2==1) {
				System.out.println("����!");
			}
			else {
				System.out.println("����");
			}
		}
		
		
		scan.close();
	}
}
