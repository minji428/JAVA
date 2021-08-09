package day08;
// 2차원배열(더블포인터)

public class Ex00 {
	public static void main(String[] args) {
		
		// int** pp = 0;
		int[][] arr = {
			{1, 2},
			{5, 6},
			{3, 4}
		};
		
		int[] tmp = arr[1];
		arr[1] = arr[2];
		arr[2] = tmp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}
}
