package day08;

import java.util.Scanner;

//# ������
public class Ex09_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101,102,103},
				{201,202,203},
				{301,302,303}
		};
		
		int[][] pay = {
				{1000,2100,1300},
				{4100,2000,1000},
				{3000,1600,800}
		};
		
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		for(int i=0; i<3; i++) {
			int tot = 0;
			for(int j=0; j<3; j++) {
				tot += pay[i][j];
			}
			System.out.println((i+1)+"���� ������ = "+tot+"��");
		}
		
		
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.print("ȣ �Է� : ");
		int ho = scan.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho) {
					System.out.println(ho+"�� ������ = "+pay[i][j]+"��");
				}
			}
		}
		
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int maxNum = pay[0][0];
		int idx1 = 0; int idx2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxNum < pay[i][j]) {
					maxNum = pay[i][j];
					
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("���� ���� ���� �� ("+apt[idx1][idx2]+")");
		
		int minNum = pay[0][0];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(minNum>pay[i][j]) {
					minNum = pay[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.println("���� ���� ���� ��("+apt[idx1][idx2]+")");
		
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		System.out.print("ȣ1 �Է� : ");
		int ho1 = scan.nextInt();
		System.out.print("ȣ2 �Է� : ");
		int ho2 = scan.nextInt();
		
		int idx1_i = 0; int idx1_j = 0;
		int idx2_i = 0; int idx2_j = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho1) {
					idx1_i = i;
					idx1_j = j;
				}
				if(apt[i][j] == ho2) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		int temp = pay[idx1_i][idx1_j];
		pay[idx1_i][idx1_j] = pay[idx2_i][idx2_j];
		pay[idx2_i][idx2_j] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
		
	}
}
