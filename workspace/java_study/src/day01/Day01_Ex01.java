package day01;

import java.util.Random;
import java.util.Scanner;

public class Day01_Ex01 {
	// main + [ctrl + spacebar]
	public static void main(String[] args) {
		
		// ��¹� : sout + [ctrl + spacebar]
		System.out.println("�ȳ�");
		System.out.println("�ϼ���");
		
		// ���� : ctrl + f11
		
		// �Է� : scanner + [ctrl + spacebar] + scan = + new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		// scan ���â�� �ȳ����� scan.close(); �Է�
		scan.close();
		
		
		// ���� Random + [ctrl + spacebar] + ran = new Random();
		// ������ ()�ȿ� ���ڸ� �� �־���� ��
		Random ran = new Random();
		int r = ran.nextInt(3);			// 0, 1, 2
		System.out.println(r);
		
		//������ �����
		System.out.println("==========");
		System.out.println("��Ÿ����");
		System.out.println("����(�ҵ����)");
		System.out.println("t)�����     5000");
		
		//1.����(����)
		System.out.println(10);
		//2.����(�Ǽ�)
		System.out.println(3.14);
		//3.���� �� �� : Ȭ����ǥ
		System.out.println('B');
		//4.���� ������ : �ֵ���ǥ
		System.out.println("Java Class");
		
		
	}
}
