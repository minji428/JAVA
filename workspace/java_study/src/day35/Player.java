package day35;

public class Player extends Unit {

	public Player(String na, int max, int pow){
		super(na, max, pow);
	}

	void skill(Unit unit) {
		System.out.println("적 모두에게 데미지");
	}
}
