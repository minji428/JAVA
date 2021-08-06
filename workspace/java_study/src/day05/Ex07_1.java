package day05;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
 * 4 9 3 9
 * ...
 */
public class Ex07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int i = 0;
		while(i<4) {
			int r = ran.nextInt(4);
			
			if(check[r] == 0) {
				check[r] = 1;
				arr[i] = r+1;
				i+=1;
			}
		}
		int cnt = 1;
		
		int j = 0;
		while(j<4) {
			for(int k = 0; k<4; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			System.out.print("�Է� : ");
			int idx = scan.nextInt();
			
			if(arr[idx] == cnt) {
				arr[idx] = 9;
				cnt+=1;
				j+=1;
			}
		}
		scan.close();
	}
}
