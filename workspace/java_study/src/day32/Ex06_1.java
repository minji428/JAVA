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
		System.out.println("���밡 ������ �մϴ�");
		unit.hp -= (power+bite);
	}
	void skill() {
		System.out.println("���밡 ��ų�� �Ἥ ���ݷ��� ����մϴ�");
		power += leg;
	}
}

class Bat extends Unit{
	int fly;
	int poison;
}

public class Ex06_1 {
	public static void main(String[] args) {
		
		// == ������ ==
		
		// ���� �ٸ� Ŭ������ �迭�� ���� �Ұ����ϱ� ������
		// ����θ� ��ӹް�
		// �θ��� Ŭ������ �迭�� ����� �ѹ迭�� ���� �ٸ� Ŭ�������� ������ �� �ִ�
		
		Unit[] unitList = new Unit[10];
		Wolf wolf = new Wolf();
		unitList[0] = wolf;
		Bat bat = new Bat();
		unitList[1] = bat;
		
		unitList[0].attack(unitList[1]);
		unitList[0].skill();
		
	}
}
