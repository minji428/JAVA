package day15;

import java.util.Random;
import java.util.Scanner;

/*
 * 이동 : alt + 방향키
 * 복제 : ctrl + alt + 방향키
 * 삭제 : ctrl + d
 * 검색 : ctrl + f
 * 새파일 생성 : ctrl + n
 * 화면 확대 및 축소 : ctrl + m
 */

/*
 * # 구구단 심화
 * 1. 구구단 문제를 랜덤하게 5회 출제한다.
 * 2. 정답을 맞추면 answer 배열에 1을 저장하고,
 *    정답을 틀리면 answer 배열에 -1을 저장한다.
 * 3. answer 배열의 값이 1인 위치값을 yes 배열에 저장한다.
 * 4. answer 배열의 값이 -1인 위치값을 no 배열에 저장한다.
 *    
 *  예)
 *  	3 x 1 = 3
 *  	4 x 2 = 3
 *  	6 x 7 = 3
 *  	6 x 8 = 3
 *  	4 x 2 = 8
 *  
 *  	answer = {1, -1, -1, -1, 1}
 *  	yes    = {0, 4}
 *  	no     = {1, 2, 3}
 *  
 */

public class Ex00 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] answer = new int[5];
		int[] yes    = null;
		int[] no     = null;
		
		int j = 0;	//yes 개수
		int k = 0;	//no 개수
		
		for(int i=0; i<5; i++) {	//1~9부터 랜덤하게 숫자 출력 5회
			int x = ran.nextInt(9)+1;
			int y = ran.nextInt(9)+1;
			System.out.print(x+" X "+ y +" = "+(x*y));
			int my_answer = scan.nextInt();
			
			if((x*y) == my_answer) {	//my_answer이 정답이면 1저장
				answer[i] = 1;
				j++;
			}
			else {						//my_answer이 정답이 아니면 -1저장
				answer[i] = -1;
				k++;
			}			
		}
		for(int i=0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}System.out.println();
		
		yes = new int[j];	//정답 개수만큼 방 만들기
		no = new int[k];	//오답 개수만큼 방 만들기
		
		j=0;	k=0;	//다시 초기화
		for(int i=0; i<5; i++) {	
			if(answer[i] == 1) {	//answer 배열에 1이 저장되어 있으면 yes배열에 인덱스 저장 
				yes[j] = i;
				j++;
			}else {					//answer 배열에 -1이 저장되어 있으면 no배열에 인덱스 저장
				no[k] = i;
				k++;
			}
		}
		
		for(int i=0; i<yes.length; i++) {
			System.out.print(yes[i]+" ");
		}System.out.println();
		
		for(int i=0; i<no.length; i++) {
			System.out.print(no[i]+" ");
		}System.out.println();
		
		
		scan.close();
	}
}
