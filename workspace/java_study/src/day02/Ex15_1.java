package day02;
/*
 * # �ݺ��� while
 * 1. �ݺ����� ���� 3����
 * 1) �ʱ��
 * 2) ���ǽ�
 * 3) ������
 * 
 * 2. ����
 * �ʱ��;
 * while(���ǽ�){
 * 		���ǽ��� ���� ���� ������ ����;
 * 		������;
 * }
 */

public class Ex15_1 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i=i+1;
		}
		
		// ����1) 1~10���� �ݺ��� 5~9 ���
		i = 1;
		while(i<=10) {
			if(5<=i && i<=9) {
				System.out.print(i+" ");
			}
			i=i+1;
		}
		System.out.println();
		
		// ����2) 10~1���� �ݺ��� 6~3 �Ųٷ� ���
		i = 10;
		while(i>=1) {
			if(3<=i && i<=6) {
				System.out.print(i+" ");
			}
			i-=1;
		}
		System.out.println();
		
		// ����3) 1~10���� �ݺ��� ¦���� ���
		i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		
		// ����1) 1~5������ �� ���
		i = 1;
		int total = 0;
		while(i<=5) {
			total = total+i;
			i++;
		}
		System.out.println(total);
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		i = 1;
		while(i<=10) {
			if(i<3 || 7<=i) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		i = 1;
		total = 0;
		while(i<=10) {
			if(i<3 || 7<=i) {
				total = total +i;
			}
			i++;
		}
		System.out.println(total);
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		int cnt = 0;
		i = 1;
		while(i<=10) {
			if(i<3 || 7<=i) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
	}
}
