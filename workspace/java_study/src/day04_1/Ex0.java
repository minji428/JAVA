package day04_1;

public class Ex0 {
	/*
	 * # c언어
	 * [1] 고정 배열
	 * 		int size = 3;
	 * 		// int arr[size];		// 에러발생
	 * 		int arr[3];
	 * [2] 가변 배열(= 동적할당)
	 * 		int size = 3;
	 * 		int* p = new int[size];
	 * 
	 * # java언어
	 * 		int size = 3;
	 * 		int[] arr = new int[size];
	 * 		int arr[] = new int[size];
	 * 		=> 자바는 heap에 생성되는 메모리는 값이 자동으로 초기화된다!
	 */
	public static void main(String[] args) {
		
		int size = 3;
		int[] arr = new int[size];
		
		System.out.println(arr);		// [I@7852e922
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
	}
}


