package day04_1;
/*
 * # �迭(array)
 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
 * 2. ����
 * 		int num = 10;
 * 		int[] arr = new int[���� ����];
 * 		int arr[] = new int[���� ����];
 * 3. �ε���(index)
 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
 * 4. �ּ� ����
 */
public class Ex01_1 {
	public static void main(String[] args) {
		
		//1.�Ϲݺ���(�� ����)
		int num = 0;
		num = 10;
		System.out.println("num = "+num);
		
		//2.�ּҺ���(�ּ� ����)
		int[]arr = null;
		arr = new int[5];
		System.out.println("arr = "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		//1. �迭 ����(1)
		int[]arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		//2. �迭 ����(2) : �����
		int[]temp = {10,20,30};
		for(int i = 0; i<3; i++) {
			System.out.println(temp[i]);
		}
	}
}
