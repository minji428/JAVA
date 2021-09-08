package day32_zombie;

public class Zombie extends Unit {
	int power;
	
	public Zombie(int pos, int hp, int max) {
		super(pos, hp, max);
	}
	public void attack(Unit hero) {
		power = r.nextInt(max) +1;
		
		hero.setHP(hero.getHP()-power);
		if(hero.getHP() <= 0) {
			hero.setHP(0);
		}
		
		this.setHP(this.getHP()+power/2);
		
		System.out.println("���� "+power+"�� �������� ���� : "
				+ " ���� Hero hp : "+hero.getHP()+", ���� ü�� ȸ�� "+this.getHP());
	}
}
