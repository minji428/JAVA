package day04;

import java.util.Random;
import java.util.Scanner;

public class Ex20_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		int x = 0;
		int y = 0;
		
		int dir = 0;
		int speed = 0;
		int fee = 0;
		int move = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : "+ desX + "," + desY);
			System.out.println("현위치 : "+x+","+y);
			System.out.println("방향 : "+ dir);
			System.out.println("속도 : "+speed);
			System.out.println("=============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("방향 입력 [동1서2남3북4] : ");
				dir = scan.nextInt();
			}
			else if(sel==2) {
				System.out.print("1.속도 입력[1~3] : ");
				speed = scan.nextInt();
			}
				
			else if(sel==3) {
				if(dir==1) {
					x = x +speed;
				}
				else if(dir==2) {
					x=x-speed;
				}
				else if(dir==3) {
					y=y+speed;
				}
				else if(dir==4) {
					y=y-speed;
				}
				move = move+speed;
			}
		}
		if(desX==x && desY==y) {
			if(move%2==1) {
				fee = fee+50;
			}
			fee = fee+move/2*50;
			System.out.println("목적지에 도착하였습니다");
			System.out.println("택시비는 "+fee+"원 입니다");
			
			run = false;
		}
		
		scan.close();
	}
}
