package day21;
/*
 * [1]Ŭ������ �������
 * 1. ����
 * 2. �޼���
 * 
 * [2]�޼����� �ʿ伺
 * �ݺ��Ǵ� �ڵ带 �޼��带 ���� ��Ȱ�� �ϱ� ����
 * 
 * [3]�޼����� ����[1�ܰ�]
 * void print(){
 * 		������ ����;
 * } 
 * 1) void			: Ű����
 * 2) print()		: �޼����
 * 3) {}			: �޼��� ����
 * 4) ������ ������ �ִ�.(�ڱ� �ּҸ� �����ϰ� �ִ� ���� : this)
 * 
 * [4]�޼����� ���(ȣ��)
 * print();			: �޼����();
 */

import java.util.Scanner;

class Ex01{
	int num;
	
	void setNum() {
		System.out.println(this);
		this.num = 10;
	}
	void test1() {
		int total = 0;
		for(int i=1; i<=5; i++) {
			total += i;
		}
		System.out.println("total = "+total);
	}
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++){
			System.out.print((i+1)+". ���� �Է� : ");
			arr[i] = scan.nextInt();
		}
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxNum <arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("�ִ밪 = "+maxNum);
		
		scan.close();
	}
	
	
}
public class Ex01_2 {
	public static void main(String[] args) {
		
		Ex01 e = new Ex01();
		System.out.println(e);
		System.out.println("---------------------");
		
		e.num = 20;
		System.out.println(e.num);
		System.out.println("---------------------");
		
		e.setNum();
		System.out.println(e.num);
		
		
		System.out.println("---------------------");
		
		// ����1) 1���� 5������ ���� ����ϴ� �޼���
		e.test1();
		
		// ����2) ���� 3���� �Է¹޾� �ִ밪�� ����ϴ� �޼���
		e.test2();
	}
}
