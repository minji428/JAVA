package day26;
//static Ű����
//�޸� static ������ ������ִ�.
//���α׷� ���۽� �����Ǹ�  �� �Ѱ��� �����ȴ�. 
//new �� ������ ���������ʴ´�. 

class StaticTest{
	int a;
	static int b;
	int c;
	static void test() {
		System.out.println(b);
	}
}

public class Ex04_7 {
	public static void main(String[] args) {
		StaticTest.b = 100;
		StaticTest t = new StaticTest();
		StaticTest t1 = new StaticTest();
	}
}
