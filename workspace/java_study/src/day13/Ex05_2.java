package day13;
/*
 * # Ÿ�ڿ��� ����[2�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
 * ��)
 * ���� : mys*l
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : *sp
 * �Է� : jsp
 * ...
 */

import java.util.Random;
import java.util.Scanner;

public class Ex05_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i=0; i<1000; i++) {
			int r = ran.nextInt(words.length);
			
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		
		int i=0;
		while(i<words.length) {
			int size = words[i].length();
			int r = ran.nextInt(size);
			System.out.print("���� ["+(i+1)+"]");
			for(int j=0; j<size; j++) {
				if(j == r) {
					System.out.print("*");
				}
				else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			
			
			System.out.print("�Է� : ");
			String myWord = scan.next();
			
			if(myWord.equals(words[i])) {
				i += 1;
				
			}
		}
		scan.close();
	}
}
