package day30;

class Parent{
	void test() {
		System.out.println("testParent()");
	}
}
class ChildTest extends Parent{
	void test() {
		// �ڽ��� ������ �Լ��� �θ��� ������ �Լ��� �̸��� ���ٸ� super�� �����ϸ� �ȴ�.
		super.test();
		System.out.println("testChild()");
	}
}
public class Ex02_4 {
	public static void main(String[] args) {
		ChildTest child = new ChildTest();
		child.test();
	}
}
