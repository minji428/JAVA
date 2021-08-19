package day20;
/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

class Ex08{
	int[] game = {0,0,1,0,2,0,0,1,0};
}
public class Ex04_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex08 e = new Ex08();
		
		int player = 0;
		for(int i=0; i<e.game.length; i++) {
			if(e.game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			for(int i=0; i<e.game.length; i++) {
				System.out.print(e.game[i]+" ");
			}
			System.out.println();
			
			System.out.print("1. left 2. right : ");
			int move = scan.nextInt();
			
			if(move == 1) {
				if(player != 0 && e.game[player-1] == 1) {
					System.out.print("3. punch : ");
					int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				e.game[player] = 0;
				player -= 1;
				if(player == -1) {
					player = e.game.length-1;
				}else {
					player %= e.game.length;
				}
				e.game[player] = 2;
			}
			else if(move == 2) {
				if(player != e.game.length-1 && e.game[player+1] == 1) {
					System.out.print("3. punch : ");
					int punch = scan.nextInt();
					if(punch != 3) {
						continue;
					}
				}
				if(player + 1 >= e.game.length) {
					System.out.println("���̻� ������ �� �����ϴ�.");
					continue;
				}
				
				e.game[player] = 0;
				player += 1;
				// player %= e.game.length;
				
				
				e.game[player] = 2;
			}
		}
	}
}
