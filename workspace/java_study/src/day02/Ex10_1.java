package day02;

import java.util.Random;

public class Ex10_1 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//0~2 ������ ����
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		//���� 1) 1~5 ������ ����
		rNum = ran.nextInt(5)+1;
		System.out.println(rNum);
		
		//���� 2) -3~3 ������ ����
		rNum = ran.nextInt(7)-3;
		System.out.println(rNum);
		
	}
}
