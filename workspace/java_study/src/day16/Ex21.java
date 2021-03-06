package day16;
//# 파일 컨트롤러[2단계] : ATM

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int count = 0;
		int log = -1;
		
		String[] accs = new String[size];
		String[] pws = new String[size];
		int[] moneys = new int[size];
		
		String fileName = "atm.txt";
		
		while(true) {
			
			System.out.println("----------");
			
			for(int i=0; i<count; i++) {
				System.out.println(accs[i]+ " : " + pws[i] + " : " + moneys[i]);
			}
			System.out.println("----------");
			if(log  == -1) {
				System.out.println("상태 : 로그아웃");
			}
			else {
				System.out.println("상태 : "+accs[log]+"님, 로그인");
			}
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//회원가입
			if(sel == 1) {
				System.out.print("[가입]계좌번호 입력 : ");
				String acc = scan.next();
				
				int check = 1;
				for(int i=0; i<count; i++) {
					if(accs[i].equals(acc)) {
						check = -1;
					}
				}
				if(check == 1) {
					if(count == 5) {
						System.out.println("[메세지]더이상 가입할 수 없습니다.");
						continue;
					}
					System.out.print("[가입]비밀번호 입력 : ");
					String pw = scan.next();
					
					accs[count] = acc;
					pws[count] = pw;
					moneys[count] = 1000;
					
					count += 1;
					System.out.println("[메세지]회원가입을 축하합니다.");
				}else {
					System.out.println("[메세지]계좌번호가 중복됩니다.");
				}
			}
			
			//회원탈퇴
			else if(sel == 2) {
				//로그아웃 중이 아니라면
				if(log != -1) {
					for(int i=log; i<count-1; i++) {
						accs[i] = accs[i+1];
						pws[i] = pws[i+1];
						moneys[i] = moneys[i+1];
					}
					count -= 1;
					log = -1;
					
					System.out.println("[메세지]탈퇴되었습니다");
				}
				else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			
			//로그인
			else if(sel == 3) {
				if(log == -1) {
					System.out.print("[로그인]계좌번호 입력 : ");
					String acc = scan.next();
					
					System.out.print("[로그인]비밀번호 입력 : ");
					String pw = scan.next();
					
					for(int i=0; i<count; i++) {
						if(accs[i].equals(acc) && pws[i].equals(pw)) {
							log = i;
						}
					}
					
					if(log == -1) {
						System.out.println("[메세지]계좌번호와 비밀번호를 확인해주세요");
					}
				}
				else {
					System.out.println("[메세지]"+accs[log]+"님, 로그인 중...");
				}
			}
			
			//로그아웃
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
				else {
					log = -1;
					System.out.println("[메세지]로그아웃 되었습니다");
				}
			}
			
			//입금
			else if(sel == 5) {
				if(log != -1) {
					System.out.println("[입금]금액 입력 : ");
					int money = scan.nextInt();
					
					moneys[log] += money;
					System.out.println("[메세지]입금을 완료하였습니다");
				}
				else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			
			//출금
			else if(sel == 6) {
				if(log != -1) {
					System.out.println("[출금]금액 입력 : ");
					int money = scan.nextInt();
					
					if(moneys[log] > money) {
						moneys[log] -= money;
						System.out.println("[메세지]출금을 완료하였습니다");
					}else {
						System.out.println("[메세지]잔액이 부족합니다");
					}
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			
			//이체
			else if(sel == 7) {
				if(log != -1) {
					System.out.print("[이체]계좌번호 입력 : ");
					String acc = scan.next();
					
					int check = -1;
					for(int i=0; i<count; i++) {
						if(accs[i].equals(acc)) {
							check = i;
						}
					}
					
					if(check != -1) {
						System.out.print("[이체]금액 입력 : ");
						int money = scan.nextInt();
						if(moneys[log]>=money) {
							moneys[log] -= money;
							moneys[check] += money;
							System.out.println("[메세지]이체를 완료하였습니다");
						}else {
							System.out.println("[메세지]잔액이 부족합니다");
						}
					}else {
						System.out.println("[메세지]계좌번호를 확인해주세요");
					}
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			
			//잔액조회
			else if(sel == 8) {
				if(log!=-1) {
					System.out.println(accs[log]+"님의 계좌잔액은 "+moneys[log]+"원 입니다");
				}else {
					System.out.println("[메세지]로그인 후 이용가능합니다");
				}
			}
			
			//저장
			else if(sel == 9) {
				if(count == 0) {
					System.out.println("[메세지]저장할 데이터가 없습니다");
					continue;
				}
				String data = "";
				for(int i=0; i<count; i++) {
					data += accs[i];
					data += "/";
					data += pws[i];
					data += "/";
					data += moneys[i];
					data += "\n";
				}
				data = data.substring(0,data.length()-1);
				
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					if(fw!=null) try {fw.close();} catch (IOException e) {}
				}
			}
			
			//로드
			/* 
			 * 모든 파일을 실행할때 로드를 제일 먼저 함
			 * 그 이유는 이클립스를 끄게 되면 저장되어 있던 데이터가 다 사라지기 때문에
			 * 이전에 저장했던 내용들을 다시 불러오기 위해서
			 * ex)게임, 은행 등등 이전의 내용이 필요했던 프로그램에서 사용됨
			 * 로드를 하지 않으면 모든 데이터가 없어지고 처음부터 다시 저장됨
			*/
			else if(sel == 10) {
				File file = new File(fileName);
				if(file.exists()) {
					FileReader fr = null;	//파일을 읽고
					BufferedReader br = null;	//파일에 있는 문자열 가져오기
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String data = "";
						while(true) {
							String line = br.readLine();		//파일에 있는 문자열을 한줄씩 가져오기
																//1111/1234/1000
							if(line == null) {
								break;
							}
							data += line;						//2222/2345/1000
							data += "\n";
						}
						data = data.substring(0,data.length()-1);
						
						System.out.println("=== data ===");
						System.out.println(data);
						
						String[] temp = data.split("\n");
						// temp[0] = 1111/1234/1000
						// temp[1] = 2222/2345/1000
						// temp[2] = 3333/3456/1000
						count = temp.length;
						
						for(int i=0; i<count; i++) {
							String[] info = temp[i].split("/");		// 1111/1234/1000
							accs[i] = info[0];
							pws[i] = info[1];
							moneys[i] = Integer.parseInt(info[2]);
						}
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
				System.out.println("[메세지]프로그램 종료");
				break;
			}
		}
		scan.close();
	}
}