package day16;

import java.io.FileWriter;
import java.io.IOException;

public class Ex00 {
	public static void main(String[] args) {
		
		// �����ü����
		// ���̽� ���α׷���
		// ��� ���α׷���
		
		FileWriter fw = null;
		try 
		{
			
			// �����߻�!!!!
			
			fw = new FileWriter("ex02.txt");
			
			fw.write("�׽�Ʈ");
			
			// �����߻�!!!
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// �����߻������� �����ϰ� ������ ������ �ڵ�
			// ������ �ǹ����� ���̴� �ڵ�
			// try���� fw.close();�� ������ ���� ������ �߻��ϸ� fw.close();���� ���� �ʱ� ������
			// fw.close()�� �ش��ϴ� ������ finally�� ���ش�
			// �Ʒ��� �ǹ����� ���̴� �ڵ�
			if(fw != null) {try {fw.close();} catch (IOException e) {}}
		}	
	}
}
