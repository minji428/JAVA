package day02;
/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */
import java.util.Scanner;

public class Ex08_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = scan.nextInt();
		
		if(height >=120) {
			System.out.println("�̿� ����");
		}
		else if(height<120) {
			System.out.print("�θ�԰� �Բ� ���̳���? (yes:1, no:2) : ");
			int answer = scan.nextInt();
			
			if(answer==1) {
				System.out.println("�̿� ����");
			}
			if(answer==2){
				System.out.println("�̿� �Ұ���");
			}
		}
	}
}
