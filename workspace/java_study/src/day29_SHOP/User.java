package day29_SHOP;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class User {
	String id;
	int money;
	
	User(String id, int mo){
		this.id = id;
		money = mo;
	}
	
	void print() {
		System.out.println("["+id+"]금액 : "+money);
	}
}

class UserManager{
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	Vector<User> userList = new Vector<User>();
	int userLog = -1;
	int userCount = 0;
	
	UserManager(){
		init();
	}
	
	void init() {
		String[] a = { "김", "박", "이", "최", "정", "오" };
		String[] b = { "철", "병", "만", "여", "아", "영" };
		String[] c = { "수", "욱", "수", "정", "름", "희" };
		for(int i=0; i<10; i++) {
			int r = ran.nextInt(a.length);
			String name = a[r];
			r = ran.nextInt(b.length);
			name += b[r];
			r = ran.nextInt(c.length);
			name += c[r];
			User temp = new User(name, ran.nextInt(5000));
			userList.add(temp);
		}
	}
	
	void join() {
		System.out.print("[가입] id 를 입력하세요 : ");
		String id = scan.next();
		User temp = new User(id,0);
		userList.add(temp);
		System.out.println("[메세지] "+temp.id+"님 가입을 축하합니다");
		userCount += 1;
	}
	void leave() {
		System.out.println("탈퇴할 아이디를 입력하세요");
		String delId = scan.next();
		int idx = -1;
		
		for(int i=0; i<userList.size(); i++) {
			if(userList.get(i).equals(delId)) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("일치하는 아이디가 없습니다");
			return;
		}
		
//		User temp = new User[userCount-1];
		for(int i=0; i<userCount; i++) {
			
		}
	}
	
	boolean logIn() {
		userLog =-1;
		System.out.print("[로그인] id를 입력하세요 : ");
		String id = scan.next();
		for(int i=0; i<userList.size(); i++) {
			if(id.equals(userList.get(i).id)) {
				userLog = i;
				break;
			}
		}
		if(userLog == -1) {
			System.out.println("[메세지] 없는 id 입니다");
		}else {
			System.out.println("[메세지] "+userList.get(userLog).id+"님 로그인");
			return true;
		}
		return false;
	}
	
	void logOut() {
		if(userLog != -1) {
			System.out.println("[메세지] "+userList.get(userLog).id+"님 로그아웃");
		}
		userLog = -1;
	}
	
	void printUser() {
		for(int i=0; i<userList.size(); i++) {
			System.out.print("["+i+"] ");
			userList.get(i).print();
		}
	}
	
	
	
}