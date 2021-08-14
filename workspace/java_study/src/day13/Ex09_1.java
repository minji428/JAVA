package day13;
/*
 * # 단어 검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

import java.util.Scanner;

public class Ex09_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요: ");
		String word = scan.next();
		
		
		char[] arr = new char[text.length()];
		//string이 아닌 char로 해야 하는 이유는 charAt가 char로 변환하기 때문에
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check =-1;
		//arr.length-size+1인 이유는  만약 too를 검색한다고 하면 앞에서 부터 lif/ife/fe /e i ...
		//으로 검색을 하게 되는데 마지막에 .  으로 검색을 하게 되면 문제가 생기니
		//rt.으로 검색을 마지막으로 끝내기 위해서
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
