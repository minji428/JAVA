package day21;

class Stu {
	String name;
}

public class Ex00_2 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		int[] 	nums = {n1, n2, n3};
		
		Stu s1 = new Stu();
		Stu s2 = new Stu();
		Stu s3 = new Stu();
		
		Stu[] students = {s1, s2, s3};
		
		//---------------------------------
		
		Stu[] arr = new Stu[3];
		
		// Student[] arr = new Student[3] ó�� ���� ������ ���� ������
		// for(int i ... ������ �� ����� �Ѵ�
		// ������ �׳� []�� ���� null�̱� ������ null.name = "ȫ�浿"�� �� �Ͱ� ���� ������
		// ������ ����
		//----------------------------
		for(int i=0; i<3; i++) {
			arr[i] = new Stu();
		}
		//----------------------------
		arr[0].name = "ȫ�浿";
		
	}
}
