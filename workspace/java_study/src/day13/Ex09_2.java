package day13;
/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */
import java.util.Scanner;

public class Ex09_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
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
			
			System.out.print("무엇으로 바꾸시겠습니까?");
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
			System.out.println("해당 언어는 존재하지 않습니다");
		}
		
		scan.close();
	}
}
