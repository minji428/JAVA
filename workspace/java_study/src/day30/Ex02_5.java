package day30;

class TestParent{
	private int a;
	protected int b;
	int c;
	public int d;
}
class TestChild extends TestParent{
	
}
//���������� ���� 
//public    ==> 1) ��𼭵� ��밡���ϴ�. 
//private   ==> 1) �ڽ�Ŭ�����ȿ����� ��밡��
//protected ==> 1) ��Ű���� �ٸ��� �ڽ�Ŭ������ �ڽ�Ŭ���� ������ ��밡��  2) ��Ű���������� public ������. 
//default   ==> 1) �ƹ��͵��Ⱦ��� ����Ʈ �̴�.  2) ��Ű���� �ٸ��� private ��Ű���� ������ public ������. 
public class Ex02_5 {
	public static void main(String[] args) {
		TestChild tc = new TestChild();
		tc.b = 0;
		tc.c = 0;
		tc.d = 0;
	}
}
