package day02;

import java.util.Random;

/*
 * # ��÷����[1�ܰ�] 30%�� ��÷Ȯ��
 */

public class Ex10_3 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int rNum = ran.nextInt(10);
		if(rNum<3) {
			System.out.println("��÷");
		}
		else {
			System.out.println("��");
		}
	}
}
