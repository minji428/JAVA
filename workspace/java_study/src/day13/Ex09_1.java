package day13;
/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */

import java.util.Scanner;

public class Ex09_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ���: ");
		String word = scan.next();
		
		
		char[] arr = new char[text.length()];
		//string�� �ƴ� char�� �ؾ� �ϴ� ������ charAt�� char�� ��ȯ�ϱ� ������
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check =-1;
		//arr.length-size+1�� ������  ���� too�� �˻��Ѵٰ� �ϸ� �տ��� ���� lif/ife/fe /e i ...
		//���� �˻��� �ϰ� �Ǵµ� �������� .  ���� �˻��� �ϰ� �Ǹ� ������ �����
		//rt.���� �˻��� ���������� ������ ���ؼ�
		for(int i=0; i<arr.length - size + 1; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == size) {
				check =1;
			}
		}
		if(check == 1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		
		scan.close();
	}
}
