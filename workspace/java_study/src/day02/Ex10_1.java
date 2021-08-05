package day02;

import java.util.Random;

public class Ex10_1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//0~2 사이의 랜덤
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		//문제 1) 1~5 사이의 랜덤
		rNum = ran.nextInt(5)+1;
		System.out.println(rNum);
		
		//문제 2) -3~3 사이의 랜덤
		rNum = ran.nextInt(7)-3;
		System.out.println(rNum);
		
	}
}
