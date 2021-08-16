package day15;

import java.util.Random;
import java.util.Scanner;

/*
 * �̵� : alt + ����Ű
 * ���� : ctrl + alt + ����Ű
 * ���� : ctrl + d
 * �˻� : ctrl + f
 * ������ ���� : ctrl + n
 * ȭ�� Ȯ�� �� ��� : ctrl + m
 */

/*
 * # ������ ��ȭ
 * 1. ������ ������ �����ϰ� 5ȸ �����Ѵ�.
 * 2. ������ ���߸� answer �迭�� 1�� �����ϰ�,
 *    ������ Ʋ���� answer �迭�� -1�� �����Ѵ�.
 * 3. answer �迭�� ���� 1�� ��ġ���� yes �迭�� �����Ѵ�.
 * 4. answer �迭�� ���� -1�� ��ġ���� no �迭�� �����Ѵ�.
 *    
 *  ��)
 *  	3 x 1 = 3
 *  	4 x 2 = 3
 *  	6 x 7 = 3
 *  	6 x 8 = 3
 *  	4 x 2 = 8
 *  
 *  	answer = {1, -1, -1, -1, 1}
 *  	yes    = {0, 4}
 *  	no     = {1, 2, 3}
 *  
 */

public class Ex00 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] answer = new int[5];
		int[] yes    = null;
		int[] no     = null;
		
		int j = 0;	//yes ����
		int k = 0;	//no ����
		
		for(int i=0; i<5; i++) {	//1~9���� �����ϰ� ���� ��� 5ȸ
			int x = ran.nextInt(9)+1;
			int y = ran.nextInt(9)+1;
			System.out.print(x+" X "+ y +" = "+(x*y));
			int my_answer = scan.nextInt();
			
			if((x*y) == my_answer) {	//my_answer�� �����̸� 1����
				answer[i] = 1;
				j++;
			}
			else {						//my_answer�� ������ �ƴϸ� -1����
				answer[i] = -1;
				k++;
			}			
		}
		for(int i=0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}System.out.println();
		
		yes = new int[j];	//���� ������ŭ �� �����
		no = new int[k];	//���� ������ŭ �� �����
		
		j=0;	k=0;	//�ٽ� �ʱ�ȭ
		for(int i=0; i<5; i++) {	
			if(answer[i] == 1) {	//answer �迭�� 1�� ����Ǿ� ������ yes�迭�� �ε��� ���� 
				yes[j] = i;
				j++;
			}else {					//answer �迭�� -1�� ����Ǿ� ������ no�迭�� �ε��� ����
				no[k] = i;
				k++;
			}
		}
		
		for(int i=0; i<yes.length; i++) {
			System.out.print(yes[i]+" ");
		}System.out.println();
		
		for(int i=0; i<no.length; i++) {
			System.out.print(no[i]+" ");
		}System.out.println();
		
		
		scan.close();
	}
}
