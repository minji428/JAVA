package day08;
//# 2�����迭 �⺻����[2�ܰ�]

import java.util.Scanner;

public class Ex08_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10*k;
				k+= 1;
			}
		}
		
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε���1 �Է� : ");
		int idx1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int idx2 = scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.println("�� �Է� : ");
		int data = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == data) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("�ε���1 : "+idx1);
		System.out.println("�ε���2 : "+idx2);
		System.out.println();
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		int maxNum = arr[0][0];
		idx1 = 0; 
		idx2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("�ε���1 : "+idx1);
		System.out.println("�ε���2 : "+idx2);
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.print("��1 �Է� : ");
		int data1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		int data2 = scan.nextInt();
		
		int idx1_i = 0; int idx1_j = 0;
		int idx2_i = 0; int idx2_j = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == data1) {
					idx1_i = i;
					idx1_j = j;
				}
				if(arr[i][j]==data2) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}
		
		int temp = arr[idx1_i][idx1_j];
		arr[idx1_i][idx1_j] = arr[idx2_i][idx2_j];
		arr[idx2_i][idx2_j] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
