package day03;

import java.util.Random;

/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */
public class Ex19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		
		int i = 1;
		int maxScore = 0;
		int maxNum = 0;
		int passStudent = 0;
		int total = 0;
		
		while(i<=10) {
			int score = ran.nextInt(100)+1;
			if(score>=60) {
				passStudent += 1;
			}
			if(maxScore < score) {
				maxScore = score;
				maxNum = i;
			}
			total = total + score;
			
			i++;
		}
		int avg = total/10;
		System.out.println("�������� ���� : "+total+"��");
		System.out.println("�������� ��� : "+avg+"��");
		System.out.println("�հ��� �� : "+passStudent+"��");
		System.out.println("1�� : "+maxNum+"�� "+maxScore+"��");

	}

}
