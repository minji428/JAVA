package day03;
/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */
import java.util.Scanner;

public class Ex19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		int i = 1;
		while(i<4) {
			System.out.println("������ �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if(maxNum <= num) {
				maxNum = num;
			}
			i++;
		}
		System.out.println("�ִ밪�� "+maxNum);
		
		
		
		scan.close();
	}

}
