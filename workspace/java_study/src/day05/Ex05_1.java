package day05;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */
public class Ex05_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10,20,30,40,50};
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 40
		//        값2 입력 : 20
		//		  {10, 20, 30, 40, 50}
		System.out.print("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		int data2 = scan.nextInt();
		
		for(int i = 0; i<5; i++) {
			if(arr[i]==data1) {
				idx1 = i;
			}
			if(arr[i]==data2) {
				idx2 = i;
			}
		}
		temp = arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		
		System.out.print("학번1 입력: ");
		int hakbun1 = scan.nextInt();
		
		System.out.print("학번2 입력 : ");
		int hakbun2 = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0;
		for(int i = 0; i<5; i++) {
			if(hakbuns[i]==hakbun1) {
				idx1 = i;
			}
			if(hakbuns[i]==hakbun2) {
				idx2 = i;
			}
		}
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		for(int i = 0; i<5; i++) {
			System.out.print(scores[i]+" ");
		}
		scan.close();
	}
}
