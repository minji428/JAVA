package day01;

public class Ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) {
			System.out.println("���� O");
		}
		if(false) {
			System.out.println("���� X");
		}
		//��) Ȧ¦
		int num = 8;
		System.out.println(num%2==0);
		System.out.println(num%2==1);
		
		if(num%2==0) {
			System.out.println("¦��");
		}
		if(num%2==1) {
			System.out.println("Ȧ��");
		}
		System.out.println();
		
		//����1) ���, 0, ���� ���
		num = -10;
		if(num>0) {
			System.out.println("���");
		}
		if(num==0) {
			System.out.println("0");
		}
		if(num<0) {
			System.out.println("����");
		}
		System.out.println();
		
		//����2) 4�� ��� ���
		num = 12;
		if(num%4==0) {
			System.out.println("4�� ����̴�.");
		}
		else {
			System.out.println("4�� ����� �ƴϴ�.");
		}
		System.out.println();
		
		//����3) 60�� �̻� �հ�, ���հ� ���
		int score = 87;
		if(score>=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
		
	}

}
