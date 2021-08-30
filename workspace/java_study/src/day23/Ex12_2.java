package day23;
/*
 * # static ������ ��� ���� 
 * 1. static ����
 * 1) static �޸𸮿� ����
 * 2) ���� ����
 * 
 * 2. ��� ����
 * 1) heap �޸𸮿� ����
 * 2) ���� ����
 */

class Card{
	static int width = 150;
	static int height = 300;
	
	int number;
	String shape;
}

public class Ex12_2 {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.number = 4;
		c1.shape = "heart";
		
		Card c2 = new Card();
		c2.number = 7;
		c2.shape = "spade";
		
		c1.width = 300;
		c1.height = 150;
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		System.out.println(c1.width);
		System.out.println(c1.height);

		System.out.println(c2.width);
		System.out.println(c2.height);
		
		
	}
}
