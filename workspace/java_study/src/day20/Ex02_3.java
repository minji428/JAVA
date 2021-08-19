package day20;

import java.util.Scanner;

/*
 * # �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + ����
 * 1. �й��� �Է��ϸ�, �ش� �л��� ������ ��µȴ�.
 * 2. ��, ���� �й� �Է¿� ���� ���ܻ�Ȳ�� �ݵ�� ó���ؾ� �Ѵ�.
 * 3. 1��� �õ� �л��� ������ Ȯ���� �� �ִ�.
 */
class Ex05{
	String name = "";
	
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
}
public class Ex02_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex05 mega = new Ex05();
		mega.name = "�ް� IT ����б�";
		
		while(true) {
			// �޴� ���
			System.out.println("=== "+mega.name+" ===");
			System.out.println("1. ������ ���� Ȯ��");
			System.out.println("2. 1�� �л� ���� Ȯ��");
			System.out.println("3. �õ� �л� ���� Ȯ��");
			System.out.println("4. ���� Ȯ�� �ϱ�");
			System.out.println("5. �����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			// ������ ���� Ȯ��
			if(choice == 1) {
				int total = 0;
				for(int i=0; i<mega.arScore.length; i++) {
					total += mega.arScore[i];
				}
				double avg = (double)total/mega.arScore.length;
				System.out.println("������ �� = "+mega.arHakbun.length+"��");
				System.out.println("���� = "+total+"��");
				System.out.printf("��� = %.1f��\n", avg);
			}
			// 1�� �л� ���� Ȯ��
			else if(choice == 2) {
				int maxScore = 0;
				int maxNum = 0;
				for(int i=0; i<mega.arScore.length; i++) {
					if(maxScore < mega.arScore[i]) {
						maxScore = mega.arScore[i];
						maxNum = i;
					}
				}
				System.out.println("=== 1�� ===");
				System.out.println("�й� : "+mega.arHakbun[maxNum]);
				System.out.println("���� : "+maxScore);
			}
			// �õ� �л� ���� Ȯ��
			else if(choice == 3) {
				int minScore = mega.arScore[0];
				int minNum = 0;
				for(int i=0; i<mega.arScore.length; i++) {
					if(minScore >mega.arScore[i]) {
						minScore = mega.arScore[i];
						minNum = i;
					}
				}
				System.out.println("=== �õ� ===");
				System.out.println("�й� : "+mega.arHakbun[minNum]);
				System.out.println("���� : "+minScore);
			}
			// ���� Ȯ�� �ϱ�
			else if(choice == 4) {
				System.out.print("�й��� �Է��ϼ��� : ");
				int hakbun = scan.nextInt();
				
				// �й� ��ȿ�� �˻�
				int check = -1;
				for(int i=0; i< mega.arHakbun.length; i++) {
					if(mega.arHakbun[i] == hakbun) {
						check = i;
					}
				}
				if(check == -1) {
					System.out.println("�й��� �߸� �Է��Ͽ����ϴ�.");
				}
				else {
					System.out.println(hakbun + "�й� �л��� ������ "+mega.arScore[check]);
				}
			}
			// �����ϱ�
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
			
			
		}
	}
}
