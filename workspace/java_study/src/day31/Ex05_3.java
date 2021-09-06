package day31;

class 부모 {
   void test(){
      System.out.println("부모입니다");
   }
}

class 자식 extends 부모{
   void test(){
      super.test(); //==> 이러면 부모것도 실행된다. 
      System.out.println("자식입니다");
   }
}

public class Ex05_3 {
	public static void main(String[] args) {
		자식 t = new 자식();
		t.test(); // ==> 이러면 자식 함수가 호출된다. ==>("자식입니다");
		// 그럼 부모에 있는 함수가 만약에 호출하고싶으면 어떻게 해야하나. 
		// 1) main에선 못한다. 이름을 다르게 해야한다.
		// 2) 자식안에서 super.test() 이러면 부모껏도 호출된다.
	}
}
