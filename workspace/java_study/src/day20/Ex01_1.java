package day20;
/*
 * # Ŭ����
 * 1. ����(���赵)
 * 	1) class	: Ű����
 * 	2) Ex01		: Ŭ������
 * 	3) {}		: �ڷ����� ����(�⺻ �ڷ����� ������ ����)
 * 2. ����
 * 	1) �ڷ���	 ������  = new �ڷ���();	
 *  2) Ex01  e    = new Ex01(); 
 */

class Ex01{
	int x;
	int y;
}

class Stu {
	int hakbun;
	String name;
}

public class Ex01_1 {
	public static void main(String[] args) {
		int a;		// ����
		String b;	// ���ڿ�
		int[] arr;	// �迭(��������) : �ּҸ� ���� ����
		
		a = 10;
		b = "��ö��";
		arr = new int[3];
		
		Ex01 e = new Ex01();	// Ŭ���� : ����� ���� �ڷ���(�����ڰ� ���� ����)
		e.x = 10;
		e.y = 20;
		
		System.out.println(e);	//day20.Ex01@7852e922
		
		
		// Ŭ���� : 1��
		int   x = 10;
		Stu hgd = new Stu();
		
		// Ŭ���� �迭
		int[]    c = new int[3];
		Stu[] info = new Stu[3];

	}
}
