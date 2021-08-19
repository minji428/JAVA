package day20;
/*
 * # ������ ����ϱ� : Ŭ���� + ����
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 * 
 * 	������ġ
 *----------------------
 *ITEM	QTY	AMT
 *ġ�����	1	2500
 *�Ұ�����	1	3800
 *����Ƣ��	1	1500
 *��      ��	1	1000
 *----------------------
 *�հ�ݾ�		8800
 *�����ݾ�		10000
 *----------------------
 *��       ��		1200
 */

import java.util.Scanner;

class Ex10{
	String name = "";
	
	int[] arPrice = {2500,3800,1500,1000};
	String[] arMenu = {"ġ�����", "�Ұ�����", "����Ƣ��", "�ݶ�"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}

public class Ex05_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex10 e = new Ex10();
		
		e.name = "������ġ";
		int size = e.arPrice.length;
		
		while(true) {
			System.out.println("["+e.name+" �ܹ���]");
			for(int i=0; i<size; i++) {
				System.out.println((i+1)+"."+e.arMenu[i]+"\t"+e.arPrice[i]+"��");
			}
			System.out.println("-----------------------");
			System.out.println("5. �ֹ��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(1<=sel && sel <= size) {
				sel -= 1;
				e.arCount[sel] += 1;
			}else if(sel == 5) {
				for(int i=0; i<size; i++) {
					e.total += e.arPrice[i] * e.arCount[i];
				}
				System.out.print("�� �ݾ��� "+e.total+"�� �Դϴ�.");
				System.out.print("���� �Է��ϼ��� : ");
				int money = scan.nextInt();
				
				if(money >= e.total) {
					int charge = money - e.total;
					
					System.out.println("\t������ġ");
					System.out.println("-----------------------");
					System.out.println("ITEM\tQTY\tAMT");
					for(int i=0; i<size; i++) {
						System.out.println(e.arMenu[i] + "\t"+e.arCount[i]+"\t"+e.arCount[i]*e.arPrice[i]);
					}
					System.out.println("-----------------------");
					System.out.println("�հ�ݾ�\t\t"+e.total);
					System.out.println("�����ݾ�\t\t"+money);
					System.out.println("-----------------------");
					System.out.println("�ܵ�\t\t"+charge);
				}else {
					System.out.println("���� �����մϴ�.");
				}
				break;
				
			}
		}
	}
}
