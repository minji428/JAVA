package day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 이동 : alt + 방향키
 * 복제 : ctrl + alt + 방향키
 * 삭제 : ctrl + d
 * 검색 : ctrl + f
 * 새파일 생성 : ctrl + n
 * 화면 확대 및 축소 : ctrl + m
 */

//# 파일 컨트롤러[3단계] : 장바구니
public class Ex22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
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
							System.out.print("사과");
						}else if(jang[j][1] == 2) {
							System.out.print("바나나");
						}else if(jang[j][1] == 3) {
							System.out.print("딸기");
						}
						System.out.print("/");
					}
				}
				System.out.println(")");
			}
			System.out.println("---------");
			System.out.print("상태 : ");
			if(log == -1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[log]+"님, 로그인");
			}
			System.out.println("---------");
			
			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//로그인
			if(sel == 1) {
				if(log == -1) {
					System.out.print("[로그인]ID 입력 : ");
					String id = scan.next();
					System.out.print("[로그인]PW 입력 : ");
					String pw = scan.next();
					
					for(int i=0; i<3; i++) {
						if(ids[i].equals(id)&&pws[i].equals(pw)) {
							log = i;
						}
					}
					if(log == -1) {
						System.out.println("[메세지]ID와 PW를 확인해주세요");
					}
				}
				else {
					System.out.println("[메세지]"+ids[log]+"님, 로그인중...");
				}
			}
			//로그아웃
			else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("[메세지]로그아웃 되었습니다");
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			//쇼핑
			else if(sel == 3) {
				if(log != -1) {
					for(int i=0; i<items.length; i++) {
						System.out.println((i+1)+"."+items[i]);
					}
					System.out.print("[쇼핑]상품번호를 선택하세요 : ");
					int choice = scan.nextInt();
					
					jang[count][0] = log;
					jang[count][1] = choice;
					count += 1;
					System.out.println("[메세지]장바구니에 담겼습니다");
				}
				else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			//장바구니
			else if(sel == 4) {
				if(log != -1) {
					System.out.println("["+ids[log]+"님의 장바구니]");
					
					int j=0;
					for(int i=0; i<count; i++) {
						if(log == jang[i][0]) {
							System.out.print((j+1)+".");
							if(jang[i][1] == 1) {
								System.out.println("사과");
							}
							else if(jang[i][1] == 2) {
								System.out.println("바나나");
							}
							else if(jang[i][1] == 3) {
								System.out.println("딸기");
							}
							j += 1;
						}
					}
				}
				else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			//저장
			else if(sel == 5) {
				String data = "";
				
				
				//# 장바구니 정보 저장하기
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
				System.out.println("[메세지]저장을 완료하였습니다");
			}
			//로드
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
			//종료
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();
	}
}
