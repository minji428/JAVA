package day17;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [][] student = {{"aaa","신촌","1001"}, {"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , {"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.과목 3.점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
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
			System.out.println(arr[i]+"점");
		}
		
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("1등 : "+student[index][2]);


		scan.close();
	}
}
