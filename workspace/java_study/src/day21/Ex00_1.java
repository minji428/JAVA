package day21;

class Monster {
	static int count;
	
	void init() {
		System.out.println("���� ź��!");
		count = count + 1;
	}
	
	void die() {
		System.out.println("���� ����...!");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("���Ͱ� ��� �����ߴ�!!!");
		}else {
			System.out.println("���� ������ ���� " + count + "�� ���ҽ��ϴ�!");
		}
	}
}

public class Ex00_1 {
	public static void main(String[] args) {
		
		Monster m1 = new Monster();
		m1.init();

		Monster m2 = new Monster();
		m2.init();
		
		Monster m3 = new Monster();
		m3.init();
		
		m1.die();
		
	}
}

// Ex00_1.main(null);
