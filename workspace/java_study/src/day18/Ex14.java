package day18;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		// ����) ����ܾ� ���߱�  
		// ����ܾ ���� * �� ǥ�õȴ�. 
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������. 
		// ���� �������ų� ���߸� ���� 
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size];  // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.

		while(true) {
			int c = 0;
			for(int i=0; i<size; i++) {		//���� ���������� Ȯ��
				if(check[i] == 0) {
					c += 1;
					break;
				}
			}
			if(c==0) {
				System.out.println("��� ��ȸ�� �����ؼ� ������ �����մϴ�");
				break;
			}
			
			System.out.println("�� : "+meaning);
			System.out.print("���� : ");
			for(int i=0; i<size; i++) {
				if(check[i] == 1) {
					System.out.print(word.charAt(i));	//�������������
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			System.out.println("����ܾ �Է��ϼ��� >>>");
			String me = scan.next();
			
			if(me.equals(word)==false) {
				while(true) {
					int r = ran.nextInt(size);
					if(check[r] == 0) {
						check[r] = 1;
						for(int i=0; i<size; i++) {
							if(word.charAt(i)==word.charAt(r)) {
								check[i] = 1;
							}
						}
						break;
					}
				}
			}
			else {
				System.out.println("�����Դϴ�");
				break;
			}
			
		}
		scan.close();
	}
}
