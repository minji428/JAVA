package day18;

public class Ex13 {
	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,3,100,2,2,3,1,3};
		//�� �迭���� �Ȱ��� ������ ������ ���� ���� ���ڿ� ���� ���� ������ ������ ���
		
		//��) ������ ���� ���� ���� ==> 100
		//��) ������ ���� ���� ���� ==> 3
		
		int[] arr2 = new int[arr.length];
		int arr2count = 0;
		for(int i=0; i<arr.length; i++) {
			int check = 0;
			for(int j=0; j<arr2count; j++) {
				if(arr2[j] == arr[i]) {
					check = 1;
					break;
				}
			}
			if(check == 0) {
				arr2[arr2count] = arr[i];
				arr2count += 1;
			}
		}
		for(int i=0; i<arr2count; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		int[][] arr3 = new int[arr2count][2];
		for(int i=0; i<arr3.length; i++) {
			arr3[i][0] = arr2[i];
			for(int j=0; j<arr.length; j++) {
				if(arr3[i][0] == arr[j]) {
					arr3[i][1] += 1;
				}
			}
		}
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i][0] + " : " +arr3[i][1]);
		}
	}
}
