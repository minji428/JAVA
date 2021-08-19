package day20;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

class Ex14{
	int ladder[][]= {
			{0,0,0,0,0},
			{1,1,0,1,1},
			{0,1,1,0,0},
			{0,0,1,1,0},
			{1,1,0,0,0},
			{0,1,1,0,0},
			{1,1,0,0,0},
			{0,0,0,1,1},
			{0,0,0,0,0}};

	int x = 0; int y = 0;
	
	String[] menu = {"�ҽ�������", "CU������", "������", "���õ��", "���θ���"};

}

public class Ex07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex14 e = new Ex14();
		
		
		System.out.println("[������ ���ɸ޴�]");
		
		for(int i=0; i<e.menu.length; i++) {
			System.out.println(e.menu[i]);
		}
		System.out.println("------------------");		

		for (int i = 0; i < e.ladder[0].length; i++) {
			System.out.print(" " + (i + 1) + " ");
		}
		System.out.println();
		for (int j = 0; j < e.ladder.length; j++) {
			for (int k = 0; k < e.ladder[j].length; k++) {
				if (e.ladder[j][k] == 0) {
					System.out.print(" �� ");
				} else if (k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) {
					System.out.print("���� ");
				} else if (k != e.ladder[j].length - 1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
					System.out.print(" ����");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		System.out.print("��ȣ ����[1~5] : ");
		e.x = scan.nextInt();
		e.x -= 1;
		
		for(int i=0; i<e.ladder.length; i++) {
			for(int j=0; j<e.ladder.length; j++) {
				for(int k=0; k<e.ladder[j].length; k++) {
					if(j == e.y && k == e.x){
						System.out.print(" * ");
					}else if(e.ladder[j][k] == 0) {
						System.out.print(" �� ");
					}else if(k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) {
						System.out.print("���� ");
					}else if(k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
						System.out.print(" ����");
					} 
				}
				System.out.println();
			}
			System.out.println();
			
			if(e.x != e.ladder[0].length-1 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x + 1] == 1) {
				e.x += 1;
				for(int j=0; j<e.ladder.length; j++) {
					for(int k=0; k<e.ladder[j].length; k++) {
						if(j == e.y && k == e.x){
							System.out.print(" * ");
						}else if(e.ladder[j][k] == 0) {
							System.out.print(" �� ");
						}else if(k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) {
							System.out.print("���� ");
						}else if(k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
							System.out.print(" ����");
						} 
					}
					System.out.println();
				}
				System.out.println();
			}
			else if(e.x != 0 && e.ladder[e.y][e.x] == 1 && e.ladder[e.y][e.x - 1] == 1) {
				e.x -= 1;
				for(int j=0; j<e.ladder.length; j++) {
					for(int k=0; k<e.ladder[j].length; k++) {
						if(j == e.y && k == e.x){
							System.out.print(" * ");
						}else if(e.ladder[j][k] == 0) {
							System.out.print(" �� ");
						}else if(k != 0 && e.ladder[j][k] == 1 && e.ladder[j][k - 1] == 1) {
							System.out.print("���� ");
						}else if(k != e.ladder[j].length-1 && e.ladder[j][k] == 1 && e.ladder[j][k + 1] == 1) {
							System.out.print(" ����");
						} 
					}
					System.out.println();
				}
				System.out.println();
			}
			e.y += 1;
		}
		
		System.out.println("������ ���ɸ޴��� \"" + e.menu[e.x] + "\" �Դϴ�.");
		
	}
}
