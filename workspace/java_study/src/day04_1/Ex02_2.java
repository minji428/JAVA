package day04_1;

import java.util.Scanner;

/*
 * # �л��������� ���α׷�[2�ܰ�] : �л��˻�
 */
public class Ex02_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {87,11,45,98,23};
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1	���� : 11��
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		System.out.println(arr[idx]+"��");
		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		for(int i = 0; i<5; i++) {
			if(arr[i] == score) {
				System.out.println(i);
			}
		}
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003	���� : 45��

		System.out.println("�й� �Է� : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i<5; i++) {
			if(hakbuns[i]==hakbun) {
				System.out.println(scores[i]);
			}
		}
		scan.close();
	}
}
