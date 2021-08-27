package day21;

class Monster {
	static int count;
	
	void init() {
		System.out.println("몬스터 탄생!");
		count = count + 1;
	}
	
	void die() {
		System.out.println("몬스터 죽음...!");
		count = count - 1;
		
		if(count == 0) {
			System.out.println("몬스터가 모두 전멸했다!!!");
		}else {
			System.out.println("현재 생존자 수는 " + count + "명 남았습니다!");
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
