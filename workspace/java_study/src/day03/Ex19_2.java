package day03;

import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */
public class Ex19_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		
		int i = 1;
		int maxScore = 0;
		int maxNum = 0;
		int passStudent = 0;
		int total = 0;
		
		while(i<=10) {
			int score = ran.nextInt(100)+1;
			if(score>=60) {
				passStudent += 1;
			}
			if(maxScore < score) {
				maxScore = score;
				maxNum = i;
			}
			total = total + score;
			
			i++;
		}
		int avg = total/10;
		System.out.println("전교생의 총점 : "+total+"점");
		System.out.println("전교생의 평균 : "+avg+"점");
		System.out.println("합격자 수 : "+passStudent+"명");
		System.out.println("1등 : "+maxNum+"번 "+maxScore+"점");

	}

}
