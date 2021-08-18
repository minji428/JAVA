package day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �̵� : alt + ����Ű
 * ���� : ctrl + alt + ����Ű
 * ���� : ctrl + d
 * �˻� : ctrl + f
 * ������ ���� : ctrl + n
 * ȭ�� Ȯ�� �� ��� : ctrl + m
 */

//# ���� ��Ʈ�ѷ�[3�ܰ�] : ��ٱ���
public class Ex22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"���", "�ٳ���", "����"};
		
		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		String fileName = "jang.txt";
		
		int count = 0;
		int log = -1;
		
		while(true) {
			System.out.println("---------");
			
			for(int i=0; i<3; i++) {
				System.out.print(ids[i] + " : " + pws[i] + "(");
				for(int j=0; j<count; j++) {
					if(jang[j][0] == i) {
						if(jang[j][1] == 1) {
							System.out.print("���");
						}else if(jang[j][1] == 2) {
							System.out.print("�ٳ���");
						}else if(jang[j][1] == 3) {
							System.out.print("����");
						}
						System.out.print("/");
					}
				}
				System.out.println(")");
			}
			System.out.println("---------");
			System.out.print("���� : ");
			if(log == -1) {
				System.out.println("�α׾ƿ�");
			}else {
				System.out.println(ids[log]+"��, �α���");
			}
			System.out.println("---------");
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			//�α���
			if(sel == 1) {
				if(log == -1) {
					System.out.print("[�α���]ID �Է� : ");
					String id = scan.next();
					System.out.print("[�α���]PW �Է� : ");
					String pw = scan.next();
					
					for(int i=0; i<3; i++) {
						if(ids[i].equals(id)&&pws[i].equals(pw)) {
							log = i;
						}
					}
					if(log == -1) {
						System.out.println("[�޼���]ID�� PW�� Ȯ�����ּ���");
					}
				}
				else {
					System.out.println("[�޼���]"+ids[log]+"��, �α�����...");
				}
			}
			//�α׾ƿ�
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("[�޼���]�α׾ƿ� �Ǿ����ϴ�");
				}else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�");
				}
			}
			//����
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length; i++) {
						System.out.println((i+1)+"."+items[i]);
					}
					System.out.print("[����]��ǰ��ȣ�� �����ϼ��� : ");
					int choice = scan.nextInt();
					
					jang[count][0] = log;
					jang[count][1] = choice;
					count += 1;
					System.out.println("[�޼���]��ٱ��Ͽ� �����ϴ�");
				}
				else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�");
				}
			}
			//��ٱ���
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("["+ids[log]+"���� ��ٱ���]");
					
					int j=0;
					for(int i=0; i<count; i++) {
						if(log == jang[i][0]) {
							System.out.print((j+1)+".");
							if(jang[i][1] == 1) {
								System.out.println("���");
							}
							else if(jang[i][1] == 2) {
								System.out.println("�ٳ���");
							}
							else if(jang[i][1] == 3) {
								System.out.println("����");
							}
							j += 1;
						}
					}
				}
				else {
					System.out.println("[�޼���]�α��� �� �̿밡���մϴ�");
				}
			}
			//����
			else if(sel == 5) {
				String data = "";
				
				
				//# ��ٱ��� ���� �����ϱ�
				for(int i=0; i<count; i++) {
					data += jang[i][0];
					data += "/";
					data += jang[i][1];
					data += "\n";
				}
				data = data.substring(0,data.length()-1);
				System.out.println(data);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					//fw.close;
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					if(fw!=null) {try {fw.close();}catch(IOException e) {}}
				}
				System.out.println("[�޼���]������ �Ϸ��Ͽ����ϴ�");
			}
			//�ε�
			else if(sel == 6) {
				File file = new File(fileName);
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						count = 0;
						String line = br.readLine();
						
						while(line != null) {
							String[] temp = line.split("/");
							jang[count][0] = Integer.parseInt(temp[0]);
							jang[count][1] = Integer.parseInt(temp[1]);
							
							count += 1;
							
							line = br.readLine();
						}
						//fr.close;
						//br.close;
					}catch(Exception e){
						e.printStackTrace();
					}finally {
						if(fr!=null) {try {fr.close();}catch(IOException e) {}}
						if(br!=null) {try {br.close();}catch(IOException e) {}}
						
					}
				}
			}
			//����
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		scan.close();
	}
}
