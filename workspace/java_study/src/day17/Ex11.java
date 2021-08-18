package day17;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [][] student = {{"aaa","����","1001"}, {"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , {"ddd" , "����","1004"}};
		String[][] score = {
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		
		int[] arr = new int[student.length];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<student.length; j++) {
				if(student[j][2].equals(score[i][0])) {
					arr[j] += Integer.parseInt(score[i][2]);
				}
			}
		}
		
		for(int i=0; i<student.length; i++) {
			System.out.print(student[i][2]+ " : ");
			System.out.println(arr[i]+"��");
		}
		
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("1�� : "+student[index][2]);


		scan.close();
	}
}
