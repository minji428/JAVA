package day30;

class MySingleTon{
	private MySingleTon() {
		// 이렇게 하면 new를 할 수 없다.
	}
	// 내부에서 new를 한다.
	static private MySingleTon instance = new MySingleTon();
	
	static public MySingleTon getMySingleTon() {
		return instance;
	}
}
public class Ex01_2 {
	// 싱글톤 패턴이란
	// 클래스를 딱 하나만 만들고 싶을때 사용한다.
	// (주로 배열을 가지고 있는 ManagerClass 등)
	
	// == 만드는 법 ==
	// 1) 생성자를 private으로 만든다. 그러면 new를 할 수 앖다.
	// 2) 내부에서 new를 한다. static 필요
	// 3) public을 get함수에만 적용한다. static 필요
	public static void main(String[] args) {
		// MySingleTon test = new MySingleTOn();	// 에러가 난다.
		MySingleTon test = MySingleTon.getMySingleTon();
	}
}
