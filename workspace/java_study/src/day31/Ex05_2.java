package day31;

// ǥ��(marker) �������̽�

interface Repairble{
	
}

// ��� ������ �ְ� ���� Ŭ����
class Unit{
	// ����� �ݵ�� ����� ���ÿ� �ʱ�ȭ�� ���Ѿ� �Ѵ�
	// ����� �ʱ�ȭ ��Ű�� ����� ����� "="�� ����ؼ� �ʱ�ȭ ��Ű�� ����� �����ڿ��� �ʱ�ȭ ��Ű�� ����� �ִ�
	final int MAX_HP;	// �ִ� HP
	int hp;	// ���� HP
	
	// ���� ������ �ִ� HP�� �Ѱܹ޾� MAX_HP�� �ʱ�ȭ ��Ű�� ������
	// GroundUnit Ŭ������ 150�� �μ��� �Ѱܼ� UnitŬ������ �����ڸ� ȣ���Ѵ�
	
	public Unit(int hp) {
		// GroundUnit Ŭ�������� �Ѱܹ��� 150���� MAX_HP�� �ʱ�ȭ ��Ų��
		MAX_HP = hp;
	}
}

// Unit Ŭ������ ��ӹ޾� ��� ���� ������ ���� Ŭ���� GroundUnit Ŭ������ �����
class GroundUnit extends Unit{
	// Tank Ŭ������ 150�� �μ��� �Ѱܼ� GroundUnit Ŭ������ �����ڸ� ȣ���Ѵ�
	public GroundUnit(int hp) {
		// Tank Ŭ�������� �Ѱܹ��� 150�� �μ��� �θ� Ŭ������ �����ڸ� ȣ���Ѵ�
		super(hp);
	}
}
// Unit Ŭ������ ��ӹ޾� ��� ���� ������ ���� Ŭ���� AirUnit Ŭ������ �����
class AirUnit extends Unit{
	public AirUnit(int hp) {
		super(hp);
	}
}

// GroundUnit Ŭ������ ��ӹ޾� Tank, Marine, SCV Ŭ������ �����
class Tank extends GroundUnit implements Repairble{
	public Tank() {
		// Tank Ŭ������ �⺻ �����ڰ� ����Ǹ� 150�� �μ��� �θ� Ŭ������ �����ڸ� ȣ���Ѵ�
		super(150);
		hp = MAX_HP;
		System.out.println("Tank�� ���� hp�� "+hp+" �Դϴ�");
	}
	
	@Override
	public String toString() {
		return "Tank [hp=" + hp + "]";
	}
}

class Marine extends GroundUnit{
	public Marine() {
		super(70);
		hp = MAX_HP;
		System.out.println("Marine�� ���� hp�� "+hp+" �Դϴ�");
	}
	
	@Override
	public String toString() {
		return "Marine [hp="+hp+"]";
	}
}

class SCV extends GroundUnit implements Repairble{
	public SCV() {
		super(100);
		hp = MAX_HP;
		System.out.println("SCV�� ���� hp�� "+hp+" �Դϴ�.");
	}
	
// �����ϴ� �޼ҵ�� ���ֺ��� ���� ������ �ʰ� ���� ���� ����� ����ϴ� ������ �̰����� �����
// �޼ҵ��� �μ��� Ŭ���� �Ǵ� �������̽��� ��ü�� ����ϸ� �μ��� ���Ǵ� Ŭ������ ��ӹ��� ��� Ŭ������ ��ü��
// �������̽��� �������� ��� Ŭ������ ��ü�� �μ��� ���� �� �ִ�
	
	public void repair(Repairble repairble) {
// ������ ��ü�� �Ѱܹ��� Repairble �������̽����� �ƹ��� ������ �����Ƿ� �μ��� �Ѱܹ��� ��ü�� ������ ������
// ����ִ� Ŭ������ ����ȯ ��Ų �� ����ؾ� �Ѵ�
		Unit unit = (Unit) repairble;
		while (unit.hp != unit.MAX_HP) {
			unit.hp++;
		}
		System.out.println(unit + " ���� �Ϸ�");
	}
	
	@Override
	public String toString() {
		return "SCV [hp="+hp+"]";
	}
}

// AirUnit Ŭ������ ��ӹ޾� DropShip Ŭ������ �����
class DropShip extends AirUnit implements Repairble{
	public DropShip() {
		super(120);
		hp = MAX_HP;
		System.out.println("DropShip�� ���� hp�� "+hp+" �Դϴ�");
	}
	
	@Override
	public String toString() {
		return "DropShip [hp="+hp+"]";
	}
}

public class Ex05_2 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine Marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
		
		scv.repair(dropShip);
	}
}
