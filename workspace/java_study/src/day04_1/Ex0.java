package day04_1;

public class Ex0 {
	/*
	 * # c���
	 * [1] ���� �迭
	 * 		int size = 3;
	 * 		// int arr[size];		// �����߻�
	 * 		int arr[3];
	 * [2] ���� �迭(= �����Ҵ�)
	 * 		int size = 3;
	 * 		int* p = new int[size];
	 * 
	 * # java���
	 * 		int size = 3;
	 * 		int[] arr = new int[size];
	 * 		int arr[] = new int[size];
	 * 		=> �ڹٴ� heap�� �����Ǵ� �޸𸮴� ���� �ڵ����� �ʱ�ȭ�ȴ�!
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


