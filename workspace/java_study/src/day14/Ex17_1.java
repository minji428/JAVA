package day14;
// # ���� ����

import java.io.FileWriter;

public class Ex17_1 {
	public static void main(String[] args) {
		
		String fileName = "ex01.txt";
		// ����ó�� ���̴� ������� ���ϰ� �������� �ο��س��Ҵ�.
		// FileWriter fw = new FileWriter(fileName);
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("���������ϱ� ��������");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
