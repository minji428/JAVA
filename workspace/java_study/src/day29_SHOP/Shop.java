package day29_SHOP;

import java.util.Scanner;
import java.util.Vector;

public class Shop {
	Scanner scan = new Scanner(System.in);
	ItemManager im = new ItemManager();
	UserManager um = new UserManager();
	
	void mainMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.가입][2.탈퇴][3.로그인][4.로그아웃]"+"\n[100.관리자]");
			int sel = scan.nextInt();
			if(sel == 1) {
				um.join();
			}else if(sel == 2) {
				um.leave();				
			}else if(sel == 3) {
				if(um.logIn()) {
					loginMenu();
				}
				
			}else if(sel == 4) {
				um.logOut();
			}else if(sel == 100) {
				ManagerMenu();
			}
		}
	}
	
	void loginMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.쇼핑][2.장바구니목록][0.뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				shopMenu();
			}else if(sel == 2) {
				cartMenu();
			}else if(sel == 0) {
				break;
			}
		}
	}
	
	void cartMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.내 장바구니][2.삭제][3.구입][0.뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printJang(um.userList.get(um.userLog));
			}
			else if(sel == 2) {
				im.printJang(um.userList.get(um.userLog));
				
				System.out.print("삭제할 아이템을 입력하세요 :");
				int del = scan.nextInt();
				/* int index = -1;
				if(index == -1) {
					System.out.println("삭제할 아이템이 존재하지 않습니다");
					return;
				}
				
				Vector<Item> temp = im.itemList;
				
				for(int i = 0; i<del; i++) {
					 im.itemList.get(i) = temp.get(i);
				}
				for(int i=del; i<; i++) {
					
				} 
				*/
			}
			else if(sel == 3) {
				shopMenu();
			}
			else if(sel == 0) {
				break;
			}
		}
	}
	
	void shopMenu() {
		boolean run = true;
		while(run) {
			im.printCategory();
			System.out.print("[카테고리]번호를 입력하세요 [종료: -1]");
			int caID = scan.nextInt();
			if(caID == -1) {
				break;
			}
			System.out.println("[아이템]번호를 입력하세요");
			im.printItemList(caID);
			int itID = scan.nextInt();
			im.addCart(um.userList.get(um.userLog).id, caID, itID);
		}
	}
	
	void categoryMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.전체카테고리][2.카테고리추가][3.카테고리삭제][0.뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printCategory();
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void itemMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.전체아이템][2.아이템추가][3.아이템삭제][0.뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printItemList();
			}else if(sel == 2) {
				im.addItem();
			}else if(sel == 3) {
				
			}else if(sel == 0) {
				run = false;
			}
			
		}
	}
	
	void ManagerMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.전체유저][2.유저추가][3.유저삭제][0.뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				um.printUser();
			}else if(sel == 0) {
				run = false;
			}
		}
	}
	
	
}
