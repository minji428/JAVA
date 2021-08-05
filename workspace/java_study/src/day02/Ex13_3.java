package day02;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 2��
 */
public class Ex13_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10)+1;
		int y = ran.nextInt(10)+1;
		
		int z = ran.nextInt(4)+1;
		int answer = 0;
		if(z==1) {
			answer = x+y;
		}
		else if(z==2) {
			answer = x-y;
		}
		else if(z==3) {
			answer = x*y;
		}
		else {
			answer = x%10;
		}
		
		System.out.println(x+"?"+y+" = "+answer);
		System.out.println("1)+ 2)- 3)* 4)%");
		int myAnswer = scan.nextInt();
		
		if(z == myAnswer) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
		scan.close();
	}
}
