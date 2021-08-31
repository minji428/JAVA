package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * [1] ���� : ID �ߺ��˻� ����
 * [2] Ż�� : ID�� �Է¹޾� Ż��
 * [3] ���� : �̸��� ������� ������ ����
 * [4] ���� : �Ʒ��� ���� �������� ����
 * 			��) 
 * 			2				// ȸ�� ��
 *			qwer,1234		// id,pw	
 *			abcd,1111		// id, pw
 */

import java.util.Scanner;

class Student{
	String id = "";
	String pw = "";
	
	void set_data(String i, String p) {
		id = i;
		pw = p;
	}
	
	void print_data() {
		System.out.println("�̸� : "+id+" ��й�ȣ : "+pw);
	}
}

class Manager{
	Student[] list = null;
	int count = 0;
	
	void add_student(Student st) {
		if(count == 0) {
			list = new Student[1];
		}else if(count >0) {
			Student[] temp = list;
			list = new Student[count +1];
			for(int i=0; i<count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[count] = st;
		count += 1;
	}
	Student remove_student(int index) {
		Student del_st = list[index];
		if(count == 1) {
			list = null;
		}
		else if(count >1) {
			Student[] temp = list;
			list = new Student[count-1];
			for(int i=0; i<index; i++) {
				list[i] = temp[i];
			}
			for(int i=index; i<count -1; i++) {
				list[i] = temp[i+1];
			}
			temp = null;
		}
		count -=1;
		return del_st;
	}
	int check_id(Student st) {
		int check = -1;
		for(int i=0; i<count; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	void print_student() {
		for(int i=0; i<count; i++) {
			list[i].print_data();
		}
	}
	String out_data() {
		String data = "";
		if(count == 0) {
			return data;
		}
		data += count;
		data += "\n";
		for(int i=0; i<count; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if(count -1 != i) {
				data += "\n";
			}
		}
		return data;
	}
	void sort_data() {
		for(int i=0; i<count; i++) {
			for(int n=0; n<count; n++) {
				if(list[i].id.compareTo(list[n].id)>0) {
					Student temp = list[i];
					list[i] = list[n];
					list[n] = temp;
				}
			}
		}
	}
	void load_student(Student[] temp, int c) {
		count = c;
		list = temp;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Manager manager = new Manager();
		
		boolean run = true;
		while(run) {
			System.out.println("1.���� 2.Ż�� 3.���� 4.��� 5.���� 6.�ε�");
			int sel = scan.nextInt();
			
			// ����
			if(sel == 1) {
				Student temp = new Student();
				System.out.println("[����]id�� �Է��ϼ��� >>> ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("[����]pw�� �Է��ϼ��� >>> ");
					temp.pw = scan.next();
					manager.add_student(temp);
					System.out.println(temp.id+"�� ������ ȯ���մϴ�");
				}else {
					System.out.println("�ߺ� ���̵� �Դϴ�");
				}
			}
			// Ż��
			else if(sel == 2) {
				manager.print_student();
				Student temp = new Student();
				System.out.println("[Ż��]id�� �Է��ϼ��� >>> ");
				temp.id = scan.next();
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("���� ���̵� �Դϴ�");
				}else {
					Student del_st = manager.remove_student(check);
					System.out.println(del_st.id+"�� Ż�� �Ǿ����ϴ�");
				}
			}
			// ����
			else if(sel == 3) {
				manager.sort_data();
				manager.print_student();
			}
			// ���
			else if(sel == 4) {
				manager.print_student();
			}
			// ����
			else if(sel == 5) {
				if(manager.count == 0) return;
				try {
					FileWriter fw = new FileWriter("student_manager.text");
					String data = manager.out_data();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					fw.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			// �ε�
			else if(sel == 6) {
				try {
					File file = new File("student_manager.text");
					if(file!=null) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine();
						int count = Integer.parseInt(line);
						Student[] temp = new Student[count];
						for(int i=0; i<count; i++) {
							temp[i] = new Student();
							line = br.readLine();
							String value[] = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						fr.close();
						br.close();
						manager.load_student(temp, count);
					}
					manager.print_student();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		//scan.close();
	}
}