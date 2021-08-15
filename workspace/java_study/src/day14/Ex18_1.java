package day14;
//# ���� �����ϱ� : ��������1

import java.io.FileWriter;

public class Ex18_1 {
	public static void main(String[] args) {
		// ��ö��/20, �̸���/30, �̿���/40
		String[] names = {"��ö��", "�̸���", "�̿���"};
		int[] ages = {20, 30, 40};
		
		String fileName = "fileTest01.txt";
		
		String data = "";
		
		for(int i=0; i<names.length; i++) {
			data += names[i];
			data += "/";
			data += ages[i];
			if(i != names.length-1) {
				data +=",";
			}
		}
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
