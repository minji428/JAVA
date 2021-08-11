package day04_1;
/*
 * # 배열(array)
 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];
 * 3. 인덱스(index)
 * 		0부터 시작하는 방번호(index)가 부여된다.
 * 4. 주소 변수
 */
public class Ex01_1 {
	public static void main(String[] args) {
		
		//1.일반변수(값 저장)
		int num = 0;
		num = 10;
		System.out.println("num = "+num);
		
		//2.주소변수(주소 저장)
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
		
		//1. 배열 사용법(1)
		int[]arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		
		//2. 배열 사용법(2) : 축약형
		int[]temp = {10,20,30};
		for(int i = 0; i<3; i++) {
			System.out.println(temp[i]);
		}
	}
}
