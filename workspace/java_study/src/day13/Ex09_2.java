package day13;
/*
 * # �ܾ� ��ü�ϱ�(replace)
 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
 * 2. ��ü���ִ� ����� �����Ѵ�.
 * ��)
 * 		Life is too short.
 * 		�����ϰ� ���� �ܾ��Է� : Life
 * 		�ٲ� �ܾ��Է� : Time
 * 
 * 		Time is too short.
 */
import java.util.Scanner;

public class Ex09_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		char[] arr = new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1;
		int idx = 0;
		for(int i=0; i<arr.length-size+1; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == size) {
				idx = i;
				check =1;
			}
		}
		if(check == 1) {
			int firstidx = idx;
			int lastIdx = idx + size;
			
			System.out.print("�������� �ٲٽðڽ��ϱ�?");
			String change = scan.nextLine();
			//int length = change.length();
			
			char[] temp = arr;
			String front = "";
			for(int i=0; i<firstidx; i++) {
				front += temp[i];
			}
			System.out.println(front);
			
			String back = "";
			for(int i=lastIdx; i<temp.length; i++) {
				back += temp[i];
			}
			System.out.println(back);
			
			String result = front + change + back;
			System.out.println(result);
		}
		else {
			System.out.println("�ش� ���� �������� �ʽ��ϴ�");
		}
		
		scan.close();
	}
}
