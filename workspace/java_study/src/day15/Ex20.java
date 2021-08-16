package day15;
//# ���� ��Ʈ�ѷ�[1�ܰ�] : ����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vector = null;
		int count = 0;
		
		String fileName = "vector.txt";
		
		while(true) {
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");
			
			System.out.print("�޴� ����  : ");
			int sel = scan.nextInt();
			
			//�߰��ϱ�
			if(sel == 1) {
				if(count == 0) {
					vector = new int[count + 1];
				}
				else if(count > 0) {
					int[] temp = vector;
					vector = new int[count + 1];
					
					for(int i=0; i<count; i++) {
						vector[i] = temp[i];
					}
					temp = null;
				}
				System.out.print("[�߰�]������ �Է� : ");
				int data = scan.nextInt();
				
				vector[count] = data;
				count += 1;
			}
			
			//�����ϱ�
			else if(sel == 2) {
				System.out.print("[����]�ε��� �Է� : ");
				int delIdx = scan.nextInt();
				
				if(count-1 < delIdx || delIdx < 0) {
					System.out.println("[�޼���]�ش� ��ġ�� ������ �� �����ϴ�.");
					continue;
				}
				if(count == 1) {
					vector = null;
				}
				else if(count > 1) {
					int[] temp = vector;
					vector = new int[count -1];
					
					int j=0;
					for(int i=0; i<count; i++) {
						if(i!=delIdx) {
							vector[j] = temp[i];
							j+=1;
						}
					}
					temp = null;
				}
				count -= 1;
			}
			
			//�����ϱ�
			else if(sel == 3) {
				String data = "";
				if(count >0) {
					for(int i=0; i<count; i++) {
						data += vector[i];
						data += "\n";
					}
					data = data.substring(0,data.length()-1);
					
					FileWriter fw = null;
					try {
						fw = new FileWriter(fileName);
						fw.write(data);
						fw.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("[�޼���]������ �����Ͱ� �����ϴ�");
				}
			}
			
			//�ε��ϱ�
			else if(sel == 4) {
				String data = "";
				File file = new File(fileName);
				if(file.exists()) {
					FileReader fr = null;
					BufferedReader br = null;
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						while(true){
							String line = br.readLine();
							if(line == null) {
								break;
							}
							data += line;
							data += "\n";
						}
						data = data.substring(0, data.length()-1);
						
						String[] temp = data.split("\n");
						count = temp.length;
						
						vector = new int[count];
						
						for(int i=0; i<count; i++) {
							vector[i] = Integer.parseInt(temp[i]);
						}
						fr.close();
						br.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			else if(sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		scan.close();
		
	}
}

