package day01;

public class Ex03_1 {
	public static void main(String[] args) {
		/* 1. ������, �� �ϳ��� ���� ������ �� �ִ� �޸� ����
		 * 2. ������ ���� : int a;
		 * 3. ������ �ʱ�ȭ : a = 10;
		 */
		
		//1. ���� : integer
		int num;
		num = 10;
		System.out.println(num);
		
		//2. �Ǽ� : double
		double dNum = 3.14;
		System.out.println(dNum);
		
		//3. ���� �� �� : character
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '��';
		System.out.println(c2);
		
		//4. ���� ������ : String
		String str = "java";
		System.out.println(str);
		
		//5. ���� ���� : boolean
		boolean result = true;
		System.out.println(result);
		
		System.out.println();
		
		//��) ������ 1000�� �ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		int ���� = 1000;
		int ���� = 200;
		int �ܵ� = ���� - ����;
		System.out.println("�ܵ� = "+�ܵ�+"�� ");
		System.out.println();
		
		//����1) ������ 100���̴�. ������? (����:����10% ����)
		int ���� = 100;
		int �������� = ����*12;
		int ���� = ��������/10;
		int ���Ŀ��� = �������� - ����;
		System.out.println("���Ŀ��� = "+���Ŀ���+"��");
		System.out.println();
		
		//����2) ���������� 30, 50, 4 ���� �޾Ҵ�. �����?
		int sc1 = 30;
		int sc2 = 50;
		int sc3 = 4;
		int total = sc1+sc2+sc3;
		double avg = total/3.0;
		System.out.println("��� = "+avg+"��");
		System.out.println();
		
		//����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		int width = 3;
		int height = 6;
		double triArea = width*height/2.0;
		System.out.println("�ﰢ���� ���� = "+triArea);
		System.out.println();
		
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int minutes = time/60;
		int seconds = time%60;
		System.out.println(minutes+"�� "+seconds+"��");
		System.out.println();
		
		//����5) 800������ 500��¥�� ����, 100��¥�� ����
		int money = 800;
		int fivHund = money/500;
		int oneHund = money%500/100;
		System.out.println("500���� ���� = "+fivHund);
		System.out.println("100���� ���� = "+oneHund);
		System.out.println();
		
		
		/* ������ ����Ģ
		 * 1. ���ڷ� ������ �� ����.
		 * 2. Ư�����ڴ� _, $�� ����Ѵ�.
		 * 3. �����(Ű����)�� ����� �� ������.
		 * ex) public, class, static, void...
		 * 4. �ڹٴ� ���ĺ��� ��ҹ��ڸ� �����Ѵ�.
		 * -------------------------------
		 * 1. ��Ű����, �������� �ҹ��ڷ� �����Ѵ�.
		 * 2. Ŭ�������� �빮�ڷ� �����Ѵ�.
		 */
		
		int test = 1;
		int Test = 2;
		System.out.println(test);
		System.out.println(Test);
		
		int $money =1000;
		int curPos = -1;		//������ġ(current position)
		System.out.println();
		
		
		/* ������ Ư¡
		 * 1. ������ ���� �Ѱ��� ������ �� �ִ�.
		 * 2. ������ ���ο� ���� ����Ǹ� ������ ���� �������.
		 * 3. ���� �̸��� ������ ����� �� ����.
		 */
		
		int num1 = 10;	//num = 10
		num1 = 9;		//num = 9
		num1 = 3;		//num = 3
		System.out.println(num1);		//num = 3
		System.out.println();
		
	
	}
}
