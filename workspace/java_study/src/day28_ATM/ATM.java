package day28_ATM;

import java.util.Scanner;

public class ATM {
	Scanner scan = new Scanner(System.in);
	UserManager userManager = new UserManager();
//	User user = new User();
	
	int log = -1;
	void menu() {
		boolean run = true;
		while(run) {
			System.out.println("[MEGA ATM]");
			System.out.println("[1.�α���]\n[2.�α׾ƿ�]\n[3.ȸ������]\n[4.ȸ��Ż��]\n[0.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				login();
			}
			else if(sel == 2) {
				logout();
			}
			else if(sel == 3) {
				join();
			}
			else if(sel == 4) {
				leave();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void login() {
		log = userManager.logUser();
		if(log!=-1) {
			loginMenu();
		}else {
			System.out.println("[�޼���]�α��� ����");
		}
	}
	
	void join() {
		userManager.addUser();
	}
	void logout() {
		log = -1;
	}
	void leave() {
		userManager.leave();
	}
	void loginMenu() {
		boolean run = true;
	
		
		while(run) {
			System.out.println("[1.���»���][2.���»���][3.��ȸ][0.�α׾ƿ�]");
			int sel = scan.nextInt();
			if(sel == 1) {			
				if(userManager.user[userManager.log].accCount == 0) {
					userManager.user[userManager.log].acc = new Account[1];
					//user.acc = new Account[1];
				}else {
					Account[] temp = userManager.user[userManager.log].acc;	//user.acc;
					
					userManager.user[userManager.log].acc = new Account[userManager.user[userManager.log].accCount+1];
					
					for(int i=0; i<userManager.user[userManager.log].accCount; i++) {
						userManager.user[userManager.log].acc[i] = temp[i];
					}
				}
				userManager.user[userManager.log].acc[userManager.user[userManager.log].accCount] = new Account();
				
				System.out.print("[����]���¸� �Է��ϼ��� : ");
				String number = scan.next();
				userManager.user[userManager.log].acc[userManager.user[userManager.log].accCount].number = number;
								
				System.out.print("[����]�Ա��� �ݾ��� �Է��ϼ��� : ");
				int money = scan.nextInt();
				userManager.user[userManager.log].acc[userManager.user[userManager.log].accCount].money = money;
				
				userManager.user[userManager.log].accCount += 1;
								
				userManager.print_all_user();
			}
			
			else if(sel == 2) {
				System.out.print("[����]������ ���¸� �Է��ϼ��� : ");
				String name = scan.next();
				int index = -1;
				for(int i=0; i<userManager.user[userManager.log].accCount; i++) {
					if(name.equals(userManager.user[userManager.log].acc[i].number)) {
						index = i;
					}
				}
				if(index == -1) {
					System.out.println("��ġ�ϴ� ���¹�ȣ�� �����ϴ�");
					return;
				}
				Account[] temp = userManager.user[userManager.log].acc;
				userManager.user[userManager.log].acc = new Account[userManager.user[userManager.log].accCount-1];
				for(int i=0; i<index; i++) {
					userManager.user[userManager.log].acc[i] = temp[i];
				}
				for(int i=index; i<userManager.user[userManager.log].accCount-1; i++) {
					userManager.user[userManager.log].acc[i] = temp[i+1];
				}
				
				userManager.user[userManager.log].accCount -= 1;
				
				userManager.print_all_user();
				System.out.println(run);
				}
			else if(sel == 3) {
				userManager.print_all_user();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
}
