package day02;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */

public class Ex10_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		if(coin == 0) {
			System.out.println("ġƮŰ = �ո�");
		}
		if(coin == 1) {
			System.out.println("ġƮŰ = �޸�");
		}
		
		System.out.print("������ �ո�(0), �޸�(1) �Է�:");
		int me = scan.nextInt();
		if(coin == me) {
			System.out.println("����!");
		}
		else {
			System.out.println("��!");
		}
		scan.close();
	}
}
