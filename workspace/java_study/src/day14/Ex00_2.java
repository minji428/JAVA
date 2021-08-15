package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex00_2 {
	public static void main(String[] args) {
		
		// # 파일 쓰기(input output :: IO)
		
		try {
			FileWriter fw = new FileWriter("0811.txt");	
			fw.write("테스트 중...");
			
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//------------------------------------------------------
		
		// # 파일 불러오기
		// 1. 파일의 존재유무 확인 : File
		// 2. 파일 읽기 : FileReader
		// 3. 파일 안의 문자열 가져오기 : BufferedReader
		
		File file = new File("0811.txt");
		if(file.exists()) {
			
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String data = br.readLine();
				System.out.println(data);
								
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
}







