package day01;

public class Ex02 {
	public static void main(String[] args) {
		
		// ���� / ���� = ����
		// ���� / �Ǽ� = �Ǽ�
		// �Ǽ� / ���� = �Ǽ�
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10%3);
		System.out.println();
		
		// ���� ������
		// 1) "����"+"����" = "����"
		System.out.println("�ȳ�"+"�ϼ���");
		// 2) ����+"����" = "����"
		System.out.println("10"+3);
		// 3) "����"+���� = "����"
		System.out.println(3+"10");
		
		System.out.println("���ϱ� = "+10+3);
		System.out.println("���ϱ� = "+(10+3));
		System.out.println();
		
		// ��) ������ 1000�� �ִ�. 200��¥�� ���� ���� ��, �ܵ� ���
		System.out.println(1000-200);
		System.out.println("�ܵ� = "+(1000-200)+"��");
		System.out.println();
		
		// ����1) ������ 100���̴�. ������? (����:���� 10%����)
		System.out.println((100*12)*0.9);
		System.out.println("���� = "+(100*12*0.9)+"��");
		System.out.println();
		
		// ����2) ���������� 30, 50, 4���� �޾Ҵ�. �����?
		System.out.println((30+50+4)/3);
		System.out.println("��� = "+(30+50+4)/3+"��");
		System.out.println();
		
		// ����3) ���ΰ� 3�̰� ���ΰ� 6�� �ﰢ�� ���� ���
		System.out.println((3*6)/2.0);
		System.out.println("���� = "+(3*6)/2.0);
		System.out.println();
		
		// ����4) 100�ʸ� 1�� 40�ʷ� ���
		System.out.println(100/60);
		System.out.println(100%60);
		System.out.println(100/60+"�� "+100%60+"��");
		System.out.println();
		
		// ����5) 800������ 500��¥�� ����, 100��¥�� ���� ���
		System.out.println(800/500);
		System.out.println(800%500/100);
		System.out.println("500�� = "+800/500+"��");
		System.out.println("100�� = "+800%500/100+"��");
		System.out.println();
		
		
		/* ���� ������
		 * ������ ���� ���� �����ڸ� ���ؼ�����
		 * ���� ������ �����ϴ�.
		 */
		
		int num = 8;
		System.out.println(num+1);
		System.out.println(num);
		
		num = num+1;
		System.out.println(num);

		
	}
}
