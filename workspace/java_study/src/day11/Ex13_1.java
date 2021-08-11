package day11;

import java.util.Scanner;

public class Ex13_1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("1~백만 사이의 숫자 입력 : ");
		int num = scan.nextInt();
		
		int cnt = 0;	//자리수 카운트 
		
		for(int i=1; i<num;) {
			if(num/i != 0) {
				cnt += 1;
			}
			i = i*10;	//i를 10씩 증가시켜서 몇자리인지 알아보기
		}
		
		System.out.println("자리수 : "+cnt);
		
		int arr[] = new int[cnt];	//자리수 만큼 배열을 만듦
		
		//cnt만큼 j를 10씩 증가 시키기
		int j=1;
		for(int i=1; i<cnt; i++) {
			j = j*10;
		}
		
		//num을 숫자(자리)별로 배열에 저장하기
		for(int i=0; i<cnt; i++) {
			System.out.println(num);
			
			arr[i] = num/j;
			num = num%j;
			j = j/10;
		
		}
		
		System.out.println("배열에 들어간 순서");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//가운데 숫자 구하기
		int k = arr.length/2; // 가운데 인덱스 번호
		
		if(cnt%2 == 0) {
			System.out.println("짝수의 자리");
		}
		else {
			System.out.println("가운데 숫자 : "+arr[k]);
		}
		
		scan.close();
	}
}
