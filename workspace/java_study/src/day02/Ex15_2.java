package day02;

import java.util.Random;
import java.util.Scanner;

/*
 * # ������ ����[3�ܰ�]
 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
 * 2. ������ ���߸� 20���̴�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
public class Ex15_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int score = 0;
		int i = 0;
		while(i<5) {
			int x = ran.nextInt(8)+1;
			int y = ran.nextInt(9)+1;
		
			int answer = x*y;
			System.out.println(x+"x"+y+"= ?");
			int myAnswer = scan.nextInt();
			
			if(answer==myAnswer) {
				cnt++;
			}
			i++;
		}
		score = cnt*20;
		System.out.println("���� ="+score+"��");
		
		scan.close();
	}
}
