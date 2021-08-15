package day14;
//# 파일 저장하기 : 연습문제2

import java.io.FileWriter;

public class Ex18_2 {
	public static void main(String[] args) {
		// momk/1111/20000
		// megait/2222/30000
		// github/3333/40000
		
		String[] names = {"momk", "megait", "github"};
		String[] pws = {"1111", "2222", "3333"};
		int[] moneys = {20000, 30000, 40000};
		
		String fileName = "fileTest02.txt";
		
		String data = "";
		
		int size = names.length;
		for(int i=0; i<size; i++) {
			data += names[i];
			data += "/";
			data += pws[i];
			data += "/";
			data += moneys[i];
			data += "\n";
		}
		
		//마지막 글자 삭제(\n때문에 커서가 4번째 줄 위치로 바뀌는것을 3번째 줄에서 끝내게 하기 위해 마지막 \n을 삭제)
		data = data.substring(0, data.length()-1);
		System.out.println(data);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
