package day30;
/*
 * class �θ� {
   		int a;
   		int b;
	}

	class �ڽ� extends �θ�{
   		int c;
   		int d;
	}


	void main(){
   		�θ� test1 = new �θ�(); // �̷��� a, b ������
   		�ڽ� test2 = new �ڽ�(); // a,b,c,d ���� 


   		�θ� test3 = test2; �̰ǰ����ϴ�. �ֳ��� test2�� abcd �� �����ϱ�
   		�ڽ� test4 = test1; �̰� �Ұ����ϴ�. �ֳĸ� test1�� ab�� �ְ� cd �� ����.

	}
*/

class Base{
	String name;
	public void say() {
		System.out.println(name + "�� �ȳ��ϼ���");
	}
}
class Sub extends Base{
	int age;
	@Override
	public void say() {
		System.out.println(name+"���� "+age+"�� �Դϴ�");
	}
}
public class Ex04_2 {
	public static void main(String[] args) {
		Base base = new Base();
		Sub sub = new Sub();
		
		// --- Ŭ���� ����ȭ  ---
		// [1]base ������ new �Ҷ� Base ���ִ� ���븸 �����ȴ�. 
		// [2]�ݸ�, sub ������ new �Ҷ� Base �� Sub �� �Ѵ� �����ȴ�. 
		// �ᱹ, 
		// [3] sub��  Base �� ����ȯ�����ϰ�, 		
		// [4] base �� Sub ���� ����ȯ �Ұ����ϴ�.	
				
		// === �Ʒ� ��� === 	
		Base test1 = (Base)sub;	// sub�� �Ѵ� �������ֱ⶧���� �����ϴ�.
		//Sub test2 = (Sub)base; //base�� �Ѱ����������ִ�. ����������. 
		
		// === instanceof ===
		// �����ϰ� instanceof �Լ��� ����Ҽ��ִ�.
		
		Base baseTest = null;
		Sub subTest = null;
		
		if(sub instanceof Base) {
			baseTest = (Base) sub;
		}else {
			System.out.println("����ȯ �Ұ�1");
		}
		
		if(base instanceof Sub) {
			subTest = (Sub) base;
		}else {
			System.out.println("����ȯ �Ұ�2");
		}
	}
}
