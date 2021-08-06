package day05;

import java.util.Random;
import java.util.Scanner;

/*
 * # �Ｎ����
 * 1. ���� 7�� �������� 3�� �����ϸ�, ��÷�����̴�.
 */
public class Ex04_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = {0,0,7,7,7,0,0,0};
		for(int i = 0; i<7; i++) {
			lotto[i] = ran.nextInt(2);
			if(lotto[i]==0) {
				lotto[i]=7;
			}
			else if(lotto[i]==1) {
				lotto[i]=0;
			}
			
			System.out.print(lotto[i]);
		}
		System.out.println();
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("1) ���� ��� Ȯ��");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				for(int i = 0; i<6; i++) {
					if(lotto[i]==7 && lotto[i+1]==7&&lotto[i+2]==7) {
						System.out.println("��÷");
						break;
					}
				}
			}
		}
		scan.close();
	}
}