package day01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/* �Է¹ޱ�
		 * 1. import java.util.Scanner;
		 * 	java.util��Ű�� ���� Scanner Ŭ���� ������ ���� �������� �ҷ��´�.
		 * 2. scan ���� ����
		 * 	Scanner scan = new Scanner(system.in);
		 * 3. �ȳ��� �ۼ�
		 * 	System.out.print("���̸� �Է��ϼ��� : ");
		 * 4. �Է¹ޱ�
		 * 	int age = scan.nextInt();
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� "+num+"�Դϴ�");
		System.out.println();
		System.out.println("���̸� �Է��ϼ���");
		int age = scan.nextInt();
		System.out.println("����� ���̴� "+age+"�� �̱���!");
		System.out.println();
		
		//����1) ���� 2���� �Է¹޾� �� ���
		System.out.println("���� 2���� �Է��ϼ���");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum = num1+num2;
		System.out.println("�� = "+sum);
		System.out.println();
		
		//����2) ���� 1���� �Է¹޾� Ȧ���̸� true ���
		System.out.println("���� 1���� �Է��ϼ���");
		int x = scan.nextInt();
		System.out.println(x%2==1);
		System.out.println();
		
		//����3) ������ �Է¹޾� 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		System.out.println(60<=score&&score<=100);
		
		scan.close();
		
	}
}
