package day32_zombie;

// 보스인지 아닌지 구분해서 공격
public class Hero extends Unit {
	int power;
	int count;
	
	public Hero(int pos, int hp, int max, int count) {
		super(pos, hp, max);
		this.count = count;
	}
	public void attack(Unit enemy) {
		if(enemy instanceof Boss) {
			Boss boss = (Boss)enemy;
			power = r.nextInt(max)+1;
			if(boss.getShield() > 0) {
				int r = boss.getShield()-power;
				if(r>=0) {
					boss.setShield(boss.getShield()-power);
				}
				else {
					boss.setShield(0);
					boss.setHP(boss.getHP()-r);
				}
			}
			else {
				boss.setHP(boss.getHP()-power);
			}
			
			if(boss.getHP()<=0) {
				boss.setHP(0);
			}
			System.out.println("히어로가 "+power+"의 공격력으로 공격 : "+"현재 Boss hp : "+boss.getHP()
				+"현재 Boss Shield : "+ boss.getShield());
		}
		
		else {
			power = r.nextInt(max)+1;
			enemy.setHP(enemy.getHP()-power);
			if(enemy.getHP() <= 0) {
				enemy.setHP(0);
			}
			System.out.println("히어로가 "+power+"의 공격력으로 공격 : "+"현재 Zombie hp : "+enemy.getHP());
		}
	}
	
	public void recovery() {
		if(count>0) {
			setHP(getHP()+100);
			System.out.println("체력 회복해서 "+getHP()+"이 되었습니다");
			count -=1;
		}
		else if(count == 0) {
			System.out.println("모두 사용했습니다");
		}
	}
}
