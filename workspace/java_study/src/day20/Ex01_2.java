package day20;

class Student{
	String name;
	int score;
}

public class Ex01_2 {
	public static void main(String[] args) {
		// ���� ��Ű�� ���� Ŭ������ �ٸ� Ŭ�������� ����� �����ϴ�.

		Ex01 e = new Ex01();	// Ŭ���� : ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;
		
		Student hgd = new Student();
		hgd.name = "ȫ�浿";
		hgd.score = 100;
		
		System.out.println(hgd);	//day20.Student@7852e922

	}
}
