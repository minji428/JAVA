package day30;

class A{
	int aa;
}
class B extends A{
	int bb;
}
class C{
	A a = new A();
	int cc;
}
public class Ex02_1 {
	// ����̶�?
	// B ��� Ŭ���� �� A Ŭ������ ��ӹ�����
	// B �� new �� �Ҷ� AŬ������ ���� �����ȴ�.

	// ��ӹ޴¹�
	// 1) class B ���� extends �θ�Ŭ����
	public static void main(String[] args) {
		B b = new B();
		b.aa = 100;
		b.bb = 200;
		
		// ��ӹ����ʰ� ��Ӱ��� ���踸���
		// C�� A�� ��ӹ����ʾ����� ���ο� ������ ���� ���� ��ӹ����Ͱ� ������Ȳ�̳� 
		// .�� 2�� �����Ѵ�.
		C c = new C();
		c.cc = 100;
		c.a.aa = 200;
		
	}

}
