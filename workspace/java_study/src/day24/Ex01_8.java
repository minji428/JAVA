package day24;

import java.util.Scanner;

// # �л� �߰� ���� ��Ʈ�ѷ�
//   => ��Ʈ�ѷ��� �ϼ��� �Ʒ� 3���� ������ �߰��Ͻÿ�.
//   ��ö�� : ����3�� ���� 50 ����50 ���� 60 
//   �̸��� : ����2�� ���� 20 ���� 30 
//   �̿��� : ����1�� ���� 100

class Subject{
	String name;
	int score;
}

class Student{
	Subject[] subjects;
	String name;
}

public class Ex01_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] list = new Student[3];
		int count = 0;
		
		while(true) {
			
			for(int i=0; i<count; i++) {
				System.out.println("["+(i+1)+"]"+list[i].name+"�л�>>>");
				if(list[i].subjects!=null) {
					for(int j=0; j<list[i].subjects.length; j++) {
						System.out.println("["+(i+1)+"]"+list[i].subjects[j].name);
					}
				}
				System.out.println();
			}
			
			System.out.println("[1]�л� �߰��ϱ�");	// �̸� �Է¹޾� �߰�
			System.out.println("[2]���� �߰��ϱ�");	// �̸��� ���� �Է¹޾� �߰�
			System.out.println("[3]���� �߰��ϱ�");	// �̸��� ���� �׸��� ���� �Է¹޾� �߰�
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.print("�̸� �Է� : ");
				String name = scan.next();
				
				list[count] = new Student();
				list[count].name = name;
				
				count += 1;
			}
			else if(choice == 2) {
				for(int i=0; i<count; i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("�л� ���� : ");
				int select = scan.nextInt();
				select = select-1;
				
				System.out.print("���� �Է� : ");
				String subject = scan.next();
				
				if(list[select].subjects == null) {
					list[select].subjects = new Subject[1];
					
					list[select].subjects[0] = new Subject();
					list[select].subjects[0].name = subject;
				}else {
					int size = list[select].subjects.length;
					
					
				}
			}
			else if(choice == 3) {
				
			}
		}
	}
}
