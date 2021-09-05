package day30;

class MySingleTon{
	private MySingleTon() {
		// �̷��� �ϸ� new�� �� �� ����.
	}
	// ���ο��� new�� �Ѵ�.
	static private MySingleTon instance = new MySingleTon();
	
	static public MySingleTon getMySingleTon() {
		return instance;
	}
}
public class Ex01_2 {
	// �̱��� �����̶�
	// Ŭ������ �� �ϳ��� ����� ������ ����Ѵ�.
	// (�ַ� �迭�� ������ �ִ� ManagerClass ��)
	
	// == ����� �� ==
	// 1) �����ڸ� private���� �����. �׷��� new�� �� �� �״�.
	// 2) ���ο��� new�� �Ѵ�. static �ʿ�
	// 3) public�� get�Լ����� �����Ѵ�. static �ʿ�
	public static void main(String[] args) {
		// MySingleTon test = new MySingleTOn();	// ������ ����.
		MySingleTon test = MySingleTon.getMySingleTon();
	}
}
