package day01;

public class Ex04_1 {
	public static void main(String[] args) {
		
		//������ 60�� �̻��̸� true ���
		int score = 90;
		System.out.println(score>=60);
		System.out.println();
		
		//����1) 3�� ����̸� true ���
		int num1 = 15;
		System.out.println(num1%3==0);
		System.out.println();
		
		//����2) ¦���̸� true ���
		int num2 = 20;
		System.out.println(num2%2==0);
		System.out.println();
		
		//����3) �Ʒ� �� �� 1000��¥�� �̻� ȭ�� ������ 1000��¥���� 3�� �̻��̸� true ���
		int money = 178600;
		System.out.println((money%5000/1000)>=3);
		System.out.println();
		
	}
}
