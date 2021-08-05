package day03;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * # īī�� �ý�
 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
 * 3. �޴��� �Ʒ��� ����.
 * 		1) �ӵ����� : 1~3������ ����
 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
 * 4. �Ÿ� 2ĭ �� 50���� �߰��Ǿ� ��ݵ� ����Ѵ�.
 * ��) 1(50) 2(50) 3(100) 4(100) ...
 */
public class Ex20_2 {
	
	public static void enter() {
		for(int i=0; i<50; i++) {
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		
		//������ (destination)
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		//���� ��ġ
		int x = 0;
		int y = 0;
		
		//����(direction)
		int dir = 0;
		
		//�ӵ�
		int speed = 0;
		
		//���
		int fee = 0;
		
		//�̵�ĭ ��
		int move = 0;
		
		boolean run = true;
		
		while(run) {
			
			Ex20_2.enter();
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : "+desX+","+desY);
			System.out.println("����ġ : "+x+","+y);
			System.out.println("���� : "+dir);
			System.out.println("�ӵ� : "+speed);
			System.out.println("============");
			
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�ܼ� ȭ�� �����
			
			
			if(sel==1) {
				System.out.print("���� �Է�[��1��2��3��4] : ");
				dir = scan.nextInt();
			}
			else if(sel==2) {
				System.out.print("�ӵ� �Է�[1~3] : ");
				speed = scan.nextInt();
			}
			else if(sel==3) {
				if(dir == 1) {
					x = x + speed;
				}
				else if(dir == 2) {
					x = x - speed;
				}
				else if(dir == 3) {
					y = y - speed;
				}
				else if(dir == 4) {
					y = y + speed;
				}
				move = move + speed;
			}
			
			if(desX == x && desY == y) {
				if(move%2==1) {
					fee = fee + 50;
				}
				fee = fee + move/2 *50;
				
				System.out.println("�������� �����Ͽ����ϴ�");
				System.out.println("�ýú�� "+fee+"�� �Դϴ�");
				
				run = false;
			}
		}
		scan.close();
	}
}
