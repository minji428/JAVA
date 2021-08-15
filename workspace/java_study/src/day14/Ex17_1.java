package day14;
// # 파일 저장

import java.io.FileWriter;

public class Ex17_1 {
	public static void main(String[] args) {
		
		String fileName = "ex01.txt";
		// 예외처리 없이는 사용하지 못하게 강제성을 부여해놓았다.
		// FileWriter fw = new FileWriter(fileName);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("파일저장하기 연습문제");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
