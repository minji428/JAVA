package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex00_2 {
	public static void main(String[] args) {
		
		// # ���� ����(input output :: IO)
		
		try {
			FileWriter fw = new FileWriter("0811.txt");	
			fw.write("�׽�Ʈ ��...");
			
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//------------------------------------------------------
		
		// # ���� �ҷ�����
		// 1. ������ �������� Ȯ�� : File
		// 2. ���� �б� : FileReader
		// 3. ���� ���� ���ڿ� �������� : BufferedReader
		
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







