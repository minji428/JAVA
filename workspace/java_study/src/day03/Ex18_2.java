package day03;
/*
 * # 369����[2�ܰ�]
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */

public class Ex18_2 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=50) {
			int x = i/10;
			int y = i%10;
			
			int cnt = 0;
			if(x != 0 && x % 3 == 0) {
				cnt++;
			}
			if(y != 0 && y % 3 == 0) {
				cnt++;
			}
			if(cnt==1) {
				System.out.println("¦");
			}
			else if(cnt==2) {
				System.out.println("¦¦");
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}
}
