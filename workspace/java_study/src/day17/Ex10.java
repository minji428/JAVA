package day17;

public class Ex10 {
	public static void main(String[] args) {
		String[][] student = {{"aaa","신촌","1001"},{"bbb","강남","1002"},
				{"ccc","대치","1003"},{"ddd","강동","1004"}};
		String[][] score = {
				{"1001","100","20","30"},
				{"1002","10","60","60"},
				{"1003","23","63","31"},
				{"1004","45","30","35"}
		};
		
		//학생 정보와 성적이 담긴 데이터 이다
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수이다
		//문제1) 전체 성적이 1등인 학생 이름 출력
		
		int arr[] = new int[score.length];
		for(int i=0; i<arr.length; i++) {
			System.out.print(score[i][0]+" : ");
			arr[i] += Integer.parseInt(score[i][1]);
			arr[i] += Integer.parseInt(score[i][2]);
			arr[i] += Integer.parseInt(score[i][3]);
			System.out.println(arr[i]);
		}
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("1등 : "+student[index][0]);
		
	}
}
