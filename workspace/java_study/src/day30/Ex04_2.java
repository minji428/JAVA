package day30;
/*
 * class 부모 {
   		int a;
   		int b;
	}

	class 자식 extends 부모{
   		int c;
   		int d;
	}


	void main(){
   		부모 test1 = new 부모(); // 이러면 a, b 만생성
   		자식 test2 = new 자식(); // a,b,c,d 생성 


   		부모 test3 = test2; 이건가능하다. 왜나면 test2는 abcd 다 있으니깐
   		자식 test4 = test1; 이건 불가능하다. 왜냐면 test1은 ab만 있고 cd 는 없다.

	}
*/

class Base{
	String name;
	public void say() {
		System.out.println(name + "님 안녕하세요");
	}
}
class Sub extends Base{
	int age;
	@Override
	public void say() {
		System.out.println(name+"님은 "+age+"살 입니다");
	}
}
public class Ex04_2 {
	public static void main(String[] args) {
		Base base = new Base();
		Sub sub = new Sub();
		
		// --- 클래스 형변화  ---
		// [1]base 변수는 new 할때 Base 에있는 내용만 생성된다. 
		// [2]반면, sub 변수는 new 할때 Base 와 Sub 이 둘다 생성된다. 
		// 결국, 
		// [3] sub은  Base 로 형변환가능하고, 		
		// [4] base 는 Sub 으로 형변환 불가능하다.	
				
		// === 아래 결과 === 	
		Base test1 = (Base)sub;	// sub은 둘다 가지고있기때문에 가능하다.
		//Sub test2 = (Sub)base; //base는 한개만가지고있다. 에러가난다. 
		
		// === instanceof ===
		// 안전하게 instanceof 함수를 사용할수있다.
		
		Base baseTest = null;
		Sub subTest = null;
		
		if(sub instanceof Base) {
			baseTest = (Base) sub;
		}else {
			System.out.println("형변환 불가1");
		}
		
		if(base instanceof Sub) {
			subTest = (Sub) base;
		}else {
			System.out.println("형변환 불가2");
		}
	}
}
