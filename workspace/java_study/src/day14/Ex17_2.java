package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//# 파일 로드(불러오기)

public class Ex17_2 {
	public static void main(String[] args) {
		
		String fileName = "ex01.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String data = br.readLine();		//한 줄 읽어오기
				System.out.println(data);
				fr.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
