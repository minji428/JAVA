package day11;

import java.util.Scanner;

public class Ex13_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("1~�鸸 ������ ���� �Է� : ");
		int num = scan.nextInt();
		
		int cnt = 0;	//�ڸ��� ī��Ʈ 
		
		for(int i=1; i<num;) {
			if(num/i != 0) {
				cnt += 1;
			}
			i = i*10;	//i�� 10�� �������Ѽ� ���ڸ����� �˾ƺ���
		}
		
		System.out.println("�ڸ��� : "+cnt);
		
		int arr[] = new int[cnt];	//�ڸ��� ��ŭ �迭�� ����
		
		//cnt��ŭ j�� 10�� ���� ��Ű��
		int j=1;
		for(int i=1; i<cnt; i++) {
			j = j*10;
		}
		
		//num�� ����(�ڸ�)���� �迭�� �����ϱ�
		for(int i=0; i<cnt; i++) {
			System.out.println(num);
			
			arr[i] = num/j;
			num = num%j;
			j = j/10;
		
		}
		
		System.out.println("�迭�� �� ����");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//��� ���� ���ϱ�
		int k = arr.length/2; // ��� �ε��� ��ȣ
		
		if(cnt%2 == 0) {
			System.out.println("¦���� �ڸ�");
		}
		else {
			System.out.println("��� ���� : "+arr[k]);
		}
		
		scan.close();
	}
}
