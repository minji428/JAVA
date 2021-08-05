package day02;

import java.util.Scanner;

/*
 * # ����ö ��� ���
 * 1. �̿��� ������ ���� �Է¹޴´�.
 * 2. ������ ���� ������ ���� ���� ����� ����ȴ�.
 * 3. ���ǥ
 * 1) 1~5	: 500��
 * 2) 6~10	: 600��
 * 3) 11,12 : 650�� (10���������Ĵ� 2�����帶�� 50���߰�)
 * 4) 13,14 : 700�� (10���������Ĵ� 2�����帶�� 50���߰�)
 * 5) 15,16 : 750�� (10���������Ĵ� 2�����帶�� 50���߰�)
 * ... 
 */
public class Ex13_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̿��� ������ ���� �Է��ϼ��� : ");
		int station = scan.nextInt();
		
		int fee = 0;
		
		if(1<=station&&station<=5) {
			fee = 500;
		}
		else if(6<=station && station <=10) {
			fee = 600;
		}
		else if(10<station) {
			if(station%2==0) {
				fee = 600 + (station - 10)/2*50;
			}
			else {
				fee = 600 + (station - 10)/2*50 + 50;
			}
		}
		
		System.out.println("���� ��� : "+fee+"��");
	}
}
