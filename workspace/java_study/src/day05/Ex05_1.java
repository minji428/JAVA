package day05;

import java.util.Scanner;

/*
 * # �� ��ü�ϱ�[2�ܰ�] 
 */
public class Ex05_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    1) �ε���1 �Է� : 1
		//		   �ε���2 �Է� : 3
		//		  {10, 40, 30, 20, 50}
		System.out.print("�ε���1 �Է� : ");
		int idx1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// ��    2) ��1 �Է� : 40
		//        ��2 �Է� : 20
		//		  {10, 20, 30, 40, 50}
		System.out.print("��1 �Է� : ");
		int data1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		int data2 = scan.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(arr[i]==data1) {
				idx1 = i;
			}
			if(arr[i]==data2) {
				idx2 = i;
			}
		}
		temp = arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// ��    3) �й�1 �Է� : 1002
		//        �й�2 �Է� : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		
		System.out.print("�й�1 �Է�: ");
		int hakbun1 = scan.nextInt();
		
		System.out.print("�й�2 �Է� : ");
		int hakbun2 = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		for(int i = 0; i<5; i++) {
			if(hakbuns[i]==hakbun1) {
				idx1 = i;
			}
			if(hakbuns[i]==hakbun2) {
				idx2 = i;
			}
		}
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(scores[i]+" ");
		}
		scan.close();
	}
}
