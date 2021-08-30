package day24;

import java.util.Scanner;

class User1{
	String id;
	int money;
}

public class Ex01_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 100;
		User1[] user = new User1[100];
		
		for(int i=0; i<100; i++) {
			user[i] = new User1();
		}
		
		int count = 0;
		int n=0;
		while(n == 0) {
			System.out.println("1.회원가입");	// id, pw, 충전금액
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			
			int sel = scan.nextInt();
			if(sel==1){
				System.out.print("이름을 입력하세요 : ");
				user[count].id = scan.next();
				System.out.print("금액을 입력하세요 : ");
				user[count].money = scan.nextInt();
				count += 1;
			}
			if(sel == 2) {
				System.out.print("인덱스를 입력하세요 : ");
				int index = scan.nextInt();
				for(int i=index; i<count-1; i++) {
					user[i] = user[i+1];
				}
				count -= 1;
			}
			if(sel == 3) {
				for(int i=0; i<count; i++) {
					System.out.println(user[i].id+" "+user[i].money);
				}
			}
		}
	}
}
