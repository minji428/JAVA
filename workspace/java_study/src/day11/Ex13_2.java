package day11;
/*
 * # �Ҽ� ã��[3�ܰ�]
 * 1. ���ڸ� �� �� �Է¹޴´�.
 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
 * 
 * ��) Enter Number ? 1000
 *    1000���� ū ù���� �Ҽ��� 1009
 * ��) Enter Number ? 500
 *    500���� ū ù��° �Ҽ��� 503
 */

import java.util.Scanner;

public class Ex13_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number? ");
		int number = scan.nextInt();
		
		//i�� number+1���� �����ؼ� number�� number�������� ���Ѵ�
		for(int i=number+1; i<number*number; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.print(i);
				break;
			}
			
		}
		
		scan.close();
	}

}
