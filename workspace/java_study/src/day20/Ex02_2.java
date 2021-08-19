package day20;

import java.util.Random;
import java.util.Scanner;

class Ex04{
	int[] hakbuns = {1001,1002,1003,1004,1005};
	int[] scores = new int[5];
}
public class Ex02_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex04 e = new Ex04();
		
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i] + " ");
		}
		System.out.println();
				
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		int tot = 0;
		double avg = 0.0;
		for(int i=0; i<e.scores.length; i++) {
			tot += e.scores[i];
		}
		avg = tot / (double)e.scores.length;
		System.out.println("tot = "+tot);
		System.out.println("avg = "+avg);
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		int cnt = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println("cnt = "+cnt);
		
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1	���� : 11��
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(i == idx) {
				System.out.println(e.scores[i]);
			}
		}
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11		�ε��� : 1
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		for(int i=0; i<e.scores.length;i++) {
			if(e.scores[i] == score) {
				System.out.println(i);
			}
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003	���� : 45��
		System.out.println("�й� �Է� : ");
		int num = scan.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == num) {
				System.out.println(e.scores[i]);
			}
		}
		
		// ����7) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й� �Է� : ");
		num = scan.nextInt();
		
		int check = -1;
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == num) {
				check =i;
			}
		}
		if(check == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�");
		}else {
			System.out.println(e.scores[check]);
		}
				
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(maxScore < e.scores[i]) {
				maxScore = e.scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println(e.hakbuns[maxIdx]+"��("+maxScore+"��)");
		
	}
}
