package day31;

class �θ� {
   void test(){
      System.out.println("�θ��Դϴ�");
   }
}

class �ڽ� extends �θ�{
   void test(){
      super.test(); //==> �̷��� �θ�͵� ����ȴ�. 
      System.out.println("�ڽ��Դϴ�");
   }
}

public class Ex05_3 {
	public static void main(String[] args) {
		�ڽ� t = new �ڽ�();
		t.test(); // ==> �̷��� �ڽ� �Լ��� ȣ��ȴ�. ==>("�ڽ��Դϴ�");
		// �׷� �θ� �ִ� �Լ��� ���࿡ ȣ���ϰ������ ��� �ؾ��ϳ�. 
		// 1) main���� ���Ѵ�. �̸��� �ٸ��� �ؾ��Ѵ�.
		// 2) �ڽľȿ��� super.test() �̷��� �θ𲯵� ȣ��ȴ�.
	}
}
