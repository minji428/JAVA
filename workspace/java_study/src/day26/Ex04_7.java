package day26;
//static 키워드
//메모리 static 영역에 만들수있다.
//프로그램 시작시 생성되며  단 한개만 생성된다. 
//new 를 했을때 생성되지않는다. 

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
