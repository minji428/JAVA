package day04;

import java.util.Random;
import java.util.Scanner;

public class Ex20_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		int x = 0;
		int y = 0;
		
		int dir = 0;
		int speed = 0;
		int fee = 0;
		int move = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : "+ desX + "," + desY);
			System.out.println("����ġ : "+x+","+y);
			System.out.println("���� : "+ dir);
			System.out.println("�ӵ� : "+speed);
			System.out.println("=============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴����� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("���� �Է� [��1��2��3��4] : ");
				dir = scan.nextInt();
			}
			else if(sel==2) {
				System.out.print("1.�ӵ� �Է�[1~3] : ");
				speed = scan.nextInt();
			}
				
			else if(sel==3) {
				if(dir==1) {
					x = x +speed;
				}
				else if(dir==2) {
					x=x-speed;
				}
				else if(dir==3) {
					y=y+speed;
				}
				else if(dir==4) {
					y=y-speed;
				}
				move = move+speed;
			}
		}
		if(desX==x && desY==y) {
			if(move%2==1) {
				fee = fee+50;
			}
			fee = fee+move/2*50;
			System.out.println("�������� �����Ͽ����ϴ�");
			System.out.println("�ýú�� "+fee+"�� �Դϴ�");
			
			run = false;
		}
		
		scan.close();
	}
}
