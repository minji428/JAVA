package day30;

class TestParent{
	private int a;
	protected int b;
	int c;
	public int d;
}
class TestChild extends TestParent{
	
}
//접근제어자 종류 
//public    ==> 1) 어디서든 사용가능하다. 
//private   ==> 1) 자신클래스안에서만 사용가능
//protected ==> 1) 패키지가 다르면 자신클래스와 자식클래스 에서만 사용가능  2) 패키지가같으면 public 과같다. 
//default   ==> 1) 아무것도안쓰면 디폴트 이다.  2) 패키지가 다르면 private 패키지가 같으면 public 과같다. 
public class Ex02_5 {
	public static void main(String[] args) {
		TestChild tc = new TestChild();
		tc.b = 0;
		tc.c = 0;
		tc.d = 0;
	}
}
