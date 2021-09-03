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
			System.out.println("[1.����][2.Ż��][3.�α���][4.�α׾ƿ�]"+"\n[100.������]");
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
			System.out.println("[1.����][2.��ٱ��ϸ��][0.�ڷΰ���]");
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
			System.out.println("[1.�� ��ٱ���][2.����][3.����][0.�ڷΰ���]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printJang(um.userList.get(um.userLog));
			}
			else if(sel == 2) {
				im.printJang(um.userList.get(um.userLog));
				
				System.out.print("������ �������� �Է��ϼ��� :");
				int del = scan.nextInt();
				/* int index = -1;
				if(index == -1) {
					System.out.println("������ �������� �������� �ʽ��ϴ�");
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
			System.out.print("[ī�װ�]��ȣ�� �Է��ϼ��� [����: -1]");
			int caID = scan.nextInt();
			if(caID == -1) {
				break;
			}
			System.out.println("[������]��ȣ�� �Է��ϼ���");
			im.printItemList(caID);
			int itID = scan.nextInt();
			im.addCart(um.userList.get(um.userLog).id, caID, itID);
		}
	}
	
	void categoryMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.��üī�װ�][2.ī�װ��߰�][3.ī�װ�����][0.�ڷΰ���]");
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
			System.out.println("[1.��ü������][2.�������߰�][3.�����ۻ���][0.�ڷΰ���]");
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
			System.out.println("[1.��ü����][2.�����߰�][3.��������][0.�ڷΰ���]");
			int sel = scan.nextInt();
			if(sel == 1) {
				um.printUser();
			}else if(sel == 0) {
				run = false;
			}
		}
	}
	
	
}
