package day24;

import java.util.Scanner;

// # 학생 추가 삭제 컨트롤러
//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//   김철수 : 과목3개 수학 50 국어50 영어 60 
//   이만수 : 과목2개 수학 20 국어 30 
//   이영희 : 과목1개 수학 100

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
				System.out.println("["+(i+1)+"]"+list[i].name+"학생>>>");
				if(list[i].subjects!=null) {
					for(int j=0; j<list[i].subjects.length; j++) {
						System.out.println("["+(i+1)+"]"+list[i].subjects[j].name);
					}
				}
				System.out.println();
			}
			
			System.out.println("[1]학생 추가하기");	// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");	// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");	// 이름과 과목 그리고 성적 입력받아 추가
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				list[count] = new Student();
				list[count].name = name;
				
				count += 1;
			}
			else if(choice == 2) {
				for(int i=0; i<count; i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select = select-1;
				
				System.out.print("과목 입력 : ");
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
