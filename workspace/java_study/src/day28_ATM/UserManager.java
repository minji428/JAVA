package day28_ATM;

import java.util.Scanner;

public class UserManager {
	Scanner scan = new Scanner(System.in);
	User[] user = null;
	int userCount = 0;
	int log = -1;
	
	void print_all_user() {
		for(int i=0; i<user[log].accCount; i++) {
			user[log].printAccount();
		}
	}
	
	void addUser() {
		// 아이디 중복처리
		if(userCount == 0) {
			user = new User[1];
		}
		else {
			User temp[] = user;
			user = new User[userCount +1];
			for(int i=0; i<userCount; i++) {
				user[i] = temp[i];
			}
		}
		user[userCount] = new User();
		System.out.print("[가입]아이디를 입력하세요");
		String name = scan.next();
		user[userCount].name = name;
		userCount += 1;
	}
	
	User getUser(int i) {
		return user[i];
	}
	
	int logUser() {
		int log = -1;
		System.out.print("[입력 ]아이디를 입력하세요");
		String name = scan.next();
		for(int i=0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				log = i;
				System.out.println("["+user[log].name+"]님 로그인");
			}
		}
		this.log = log;
		return log;
	}
	
	void leave() {
		System.out.print("[탈퇴]탈퇴할 아이디를 입력하세요");
		String name = scan.next();
		int id = -1;
		for(int i=0; i<userCount; i++) {
			if(name.equals(user[i].name)) {
				id = i;
			}
		}
		if(id == -1) {
			System.out.println("일치하는 아이디가 없습니다");
			return;
		}
		User[] temp = user;
		user = new User[userCount-1];
		for(int i=0; i<id; i++) {
			user[i] = temp[i];
		}
		for(int i = id; i<userCount -1; i++) {
			user[i] = temp[i+1];
		}
		userCount -= 1;
	}
}
