package day20;
/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

class Ex07{
	int[] seat = new int[7];
	int money = 0;
}

public class Ex03_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex07 e = new Ex07();
		int cnt = 0;
		while(true) {
			
			for(int i=0; i<e.seat.length; i++) {
				if(e.seat[i] == 0) {
					System.out.print("[X]");
				}
				else {
					System.out.print("[O]");
				}
			}
			System.out.println();
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			// �¼�����
			if(sel == 1) {
				System.out.print("�¼���ȣ ����(1~7) : ");
				int idx = scan.nextInt();
				
				idx -= 1;
				
				if(e.seat[idx] == 0) {
					e.seat[idx] = 1;
					cnt += 1;
				}
			}
			// �����ϱ�
			else if(sel == 2) {
				e.money = cnt * 12000;
				System.out.println("�� ����� : "+e.money+"��");
				break;
			}
			
		}
	}
}
