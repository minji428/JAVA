package day01;

public class Ex04_2 {
	public static void main(String[] args) {
		/* 1. ����
		 * 1) &&(and)
		 * 2) ||(or)
		 * 
		 * 2. ����
		 * 1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
		 * 2) �� �����ڸ� ���� ���� ������ �����ϴ�.
		 */
		
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
		
		System.out.println();
		
		//��) 3�� ����̸鼭, ¦���̸� true ���
		int num = 12;
		System.out.println(num%3==0 & num%2==0);
		System.out.println();
		
		// ���� 1) ����
		// 3������ ����� 60�� �̻��̸�, true
		// ��, ��� �� �����̶� 50�� �̸��̸�, false
		int kor = 100;
		int eng = 87;
		int math = 41;
		int total = kor+eng+math;
		int avg = total/3;
		System.out.println(avg>=60 && kor>=50 && eng>=50 && math>=50);
		System.out.println();
		
		// ����2) Ű�� 200cm�̻��̰ų� �����԰� 200kg�̻��̸�, ����(true)
		int height1 = 199;
		int weight1 = 199;
		System.out.println(height1>=200 || weight1>=200);
		
		int height2 = 200;
		int weight2 = 68;
		System.out.println(height2>=200 || weight2>=200);
		System.out.println();
		
		
		
	}
}
