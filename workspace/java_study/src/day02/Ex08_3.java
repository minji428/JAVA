package day02;
/*
 * # �α���[3�ܰ�]
 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
 */
import java.util.Scanner;

public class Ex08_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		System.out.print("ID�� �Է��ϼ��� : ");
		int myId = scan.nextInt();

		
		if(dbId!=myId) {
			System.out.println("ID�� Ȯ�����ּ���");
		}
		if(dbId==myId) {
			System.out.print("PW�� �Է��ϼ��� : ");
			int myPw = scan.nextInt();
			
			if(dbPw!=myPw) {
				System.out.println("Pw�� Ȯ�����ּ���");
			}
			if(dbPw==myPw) {
				System.out.println("�α��� ����");
			}
		}
	}
}
