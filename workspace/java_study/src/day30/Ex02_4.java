package day30;

class Parent{
	void test() {
		System.out.println("testParent()");
	}
}
class ChildTest extends Parent{
	void test() {
		// 자식의 변수나 함수와 부모의 변수나 함수가 이름이 같다면 super로 구분하면 된다.
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
