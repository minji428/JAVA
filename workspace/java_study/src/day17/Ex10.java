package day17;

public class Ex10 {
	public static void main(String[] args) {
		String[][] student = {{"aaa","����","1001"},{"bbb","����","1002"},
				{"ccc","��ġ","1003"},{"ddd","����","1004"}};
		String[][] score = {
				{"1001","100","20","30"},
				{"1002","10","60","60"},
				{"1003","23","63","31"},
				{"1004","45","30","35"}
		};
		
		//�л� ������ ������ ��� ������ �̴�
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� �����̴�
		//����1) ��ü ������ 1���� �л� �̸� ���
		
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
		System.out.println("1�� : "+student[index][0]);
		
	}
}
