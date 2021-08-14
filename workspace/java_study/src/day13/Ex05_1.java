package day13;
/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��)
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : jsp
 */

import java.util.Random;
import java.util.Scanner;

public class Ex05_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		//����
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i=0;
		while(i<words.length) {
			System.out.println("���� ["+(i+1)+"]" + words[i]);
			System.out.print("�Է� : ");
			String myWord = scan.next();
			
			if(words[i].equals(myWord)) {
				i += 1;
			}
		}
		
		
		
		scan.close();
	}
}
