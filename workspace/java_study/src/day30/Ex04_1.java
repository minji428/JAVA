package day30;
//�߻�ȭ ==> �θ�Ŭ������ ��ӹ���  �ڽ�Ŭ������  Ư���޼��带 ���鵵�� �����ϴ°� 
//abstract ��ġ ==> 1. Ű���� ������ �޼��� �տ� �� 2. Ŭ���� �տ� �ٿ��ش�.

class Aa{
	int a;
	void test() {
	}
}
class Bb extends Aa{
	int b;
}
abstract class Cc{ // 1) abstract Ŭ���� �տ� �ٿ��� 
	int c;
	abstract void test();  // 2) abstract �޼��� �տ� �ٿ��� (�̸�������� ������ �ڽ����Ѵ�.)
}
class D extends Cc{
	int d;
	void test() { // ������ �������ϴ� �޼���
		
	}
}
public class Ex04_1 {
	public static void main(String[] args) {
		
	}
}
