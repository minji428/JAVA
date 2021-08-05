package day02;

import java.util.Random;

/*
 * # ´çÃ·º¹±Ç[1´Ü°è] 30%ÀÇ ´çÃ·È®·ü
 */

public class Ex10_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		if(rNum<3) {
			System.out.println("´çÃ·");
		}
		else {
			System.out.println("²Î");
		}
	}
}
