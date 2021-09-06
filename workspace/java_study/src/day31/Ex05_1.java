package day31;

abstract class AA{
	abstract void test1();	// 추상화 클래스는 abstract를 붙인것과
	void test2() {}		// 안붙인 메서드를 섞어서 만들 수 있다
}

class BB extends AA{
	void test1() {	// 따라서 자식클래스에서는 abstract가 붙어있는 메서드는 강제 구현한다
		
	}
}

interface EE{
	public void test3();
}
interface CC{
	public void test1();
	public void test2();
}
class DD implements CC, EE{
	public void test1() {}		// interface를 상속하면 메서드를 무조건 강제구현한다
	public void test2() {}
	public void test3() {}
}
//인터페이스(Interface) 클래스
//인터페이스는 추상클래스보다 더 추상화된 클래스 (전부강제)
//1. 실제 구현된 것이 전혀없는 기본 설계도.
//2. 상수와 추상 메서드만 멤버로 갖는다.
//3. 인스턴스를 생성할수 없고 , 클래스 작성에 도움을 줄목적으로
//   사용되는 클래스
//4. 다중상속이 가능하다.

public class Ex05_1 {

}
