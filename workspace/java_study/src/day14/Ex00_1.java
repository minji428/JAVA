package day14;

public class Ex00_1 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		// java.lang.ArithmeticException: / by zero
		// System.out.println(x / y);
		
		if(y != 0) {
			System.out.println(x / y);
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		// --------------------------------------------------------
		
		try {
			// �����߻� ������ �ִ� �ڵ�
			System.out.println(x / y);
		}catch(Exception e) {
			// try�������� ������ �߻����� �� ������ �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
}
