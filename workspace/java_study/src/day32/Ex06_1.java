package day32;

class Unit{
	int hp;
	int power;
	
	void attack(Unit unit) {
		
	}
	void skill() {
		
	}
}

class Wolf extends Unit{
	int leg;
	int bite;
	void Wolf() {
		power = 1;
		hp = 10;
		leg = 4;
		bite = 2;
	}
	
	void attack(Unit unit) {
		System.out.println("늑대가 공격을 합니다");
		unit.hp -= (power+bite);
	}
	void skill() {
		System.out.println("늑대가 스킬을 써서 공격력이 상승합니다");
		power += leg;
	}
}

class Bat extends Unit{
	int fly;
	int poison;
}

public class Ex06_1 {
	public static void main(String[] args) {
		
		// == 다형성 ==
		
		// 서로 다른 클래스는 배열에 저장 불가능하기 때문에
		// 공통부모를 상속받고
		// 부모의 클래스로 배열을 만들면 한배열에 서로 다른 클래스들을 저장할 수 있다
		
		Unit[] unitList = new Unit[10];
		Wolf wolf = new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;
		
		unitList[0].attack(unitList[1]);
		unitList[0].skill();
		
	}
}
