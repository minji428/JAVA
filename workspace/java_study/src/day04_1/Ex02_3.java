package day04_1;
/*
 * # �л��������� ���α׷�[3�ܰ�] : ����ó��
 */

import java.util.Scanner;

public class Ex02_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		int check = -1;
		System.out.print("�й� �Է� : ");
		int hakbun = scan.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(hakbuns[i]==hakbun) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�");
		}
		else {
			System.out.println(scores[check]);
		}
		
		
		
		scan.close();
	}
}
