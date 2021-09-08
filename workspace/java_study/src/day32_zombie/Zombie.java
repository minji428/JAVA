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
		
		System.out.println("좀비가 "+power+"의 공격으로 공격 : "
				+ " 현재 Hero hp : "+hero.getHP()+", 좀비 체력 회복 "+this.getHP());
	}
}
