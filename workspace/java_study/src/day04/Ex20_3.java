package day04;

import java.util.Scanner;

public class Ex20_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		  /* [��������]
         * ��� : ���� , ���� , ����
         * ���� : �޽� ����
         * ���� : ���� ��ȭ ����
         * ���� : ���� ��� ���� (����ϸ� ������ ����ǰ� ������ �����)
         * �⺻ HP = 100, ���ݷ� = 5
         * �г��� ���� ����
         */
		
		int HP = 100;
		int ���ݷ� = 5;
		
		System.out.println("[���� ����]�� ���Ű��� ȯ���մϴ�");
		System.out.println("���� ������ ����� �г����� �Է��ϼ���(���ڸ� �����մϴ�)");
		int name = scan.nextInt();
		System.out.println(name+"�� ȯ���մϴ�");
		System.out.println("==���� ����==");
		System.out.println("[���� ����]�������¸���, ����, ������ �ֽ��ϴ�");
		System.out.println("{����}������ ü���� ȸ���� �� �ֽ��ϴ�");
		System.out.println("{����}������ ���⸦ ��ȭ�Ͻ� �� �ֽ��ϴ�");
		System.out.println("{����}������ ���͸� ��Ƽ� ���� �� �� �ֽ��ϴ�");
		System.out.println("[����]���� {����}���� ����ϸ� ������ ����ǰ� �����Ͱ� ������ϴ�");
		System.out.println();
		System.out.println("���� ����");
		
		int start = 0;
		int place = 0;
		int place2 = 0;
		int money = 200;
		int ���ݷ�2 = 1;
		
		while(start == 0) {
			System.out.println("���� �̵��Ͻðڽ��ϱ�?");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.����");
			
			place = scan.nextInt();
			
			if(place<1||place>3) {
				System.out.println("�ٽ� �������ּ���");
			}
			if(place==1) {
				if(place2==1) {
					System.out.println("�̹� ������ �ֽ��ϴ�");
					System.out.println();
				}
				else {
					System.out.println("������ �̵��մϴ�");
					System.out.println();
					place2 = 1;
					int a = 0;
					
					while(a==0) {
						System.out.println("������ �����Ͽ����ϴ�");
						System.out.println();
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("1.ü�� ȸ��");
						System.out.println("2.�ٸ������� �̵��ϱ�");
						int village2 = scan.nextInt();
						
						if(village2==1) {
							if(HP==100) {
								System.out.println("�̹� ü���� �� ���ֽ��ϴ�");
								System.out.println();
							}
							else {
								System.out.println("ü���� ȸ���մϴ�");
								HP=100;
								System.out.println();
								System.out.println("ü���� ȸ���Ǿ����ϴ�");
							}
						}
						if(village2==2) {
							a=1;
						}
						if(village2<1||village2>2) {
							System.out.println("�ٽ� �������ּ���");
					}
				}
			}
			
			if (place == 2) {
				 
                if (place2 == 2) {
 
                    System.out.println("�̹� ������ �ֽ��ϴ�.");
 
                    System.out.println(" ");
 
                }else {
 
                    int e = 0;
 
                    while (e == 0) {
 
                        place2 = 2;
 
                        System.out.println("������ �����Ͽ����ϴ�.");
 
                        System.out.println("������ �Ͻðڽ��ϱ�?");
 
                        System.out.println("1. ���� ��ȭ");
 
                        System.out.println("2. �ٸ� ������ �̵��ϱ�");
 
                        int store = scan.nextInt();
 
                        if (store == 1) {
 
                            int p = 0;
 
                            while (p == 0) {
 
                                System.out.println("");
 
                                System.out.println("==�޴�==");
                                 System.out.println("1. ���� ��ȭ");
 
                                System.out.println("2. �ڷ� ����");
 
                                int choice = scan.nextInt();
 
                                if (choice > 2 || choice < 1) {
 
                                    System.out.println("�ٽ� �������ּ���.");
 
                                }if (choice == 1) {
 
                                    if (���ݷ�2 * 50 > money) {
 
                                        System.out.println("���� �����մϴ�.");
 
                                        System.out.println("�������� ���� ���ؿ�����.");
 
                                    }else {
 
                                        System.out.println("���Ⱑ ��ȭ �Ǿ����ϴ�.");
 
                                        money = money - ���ݷ�2 * 50;
 
                                        ���ݷ� += 10;
 
                                        ���ݷ�2 += 1;
 
                                        System.out.println("���ݷ��� " + ���ݷ� + "�̰�, ");
 
                                        System.out.println("�ܵ��� " + money + "���� �Դϴ�.");
 
                                    }
 
                                }if (choice == 2) {
 
                                    p = 1;
 
                                }
 
                            
 
                            }
 
                        }
 
                        if (store == 2) {
 
                            e = 1;
 
                        }
 
                    }
 
                }
 
            }
 
            if (place == 3) {
 
                if (place2 == 3) {
 
                    System.out.println("�̹� ������ �ֽ��ϴ�.");
 
                }else {
 
                    int t = 0;
 
                    while (t == 0) {
 
                    int enemyHP = 100;
 
                    place2 = 3;
 
                    System.out.println(" ");
 
                    System.out.println("������ �����Ͽ����ϴ�.");
 
                    System.out.println(" ");
 
                    System.out.println("������ �Ͻðڽ��ϱ�?");
 
                    System.out.println("1. ���� ���.");
 
                    System.out.println("2. �ٸ� ������ �̵��ϱ�.");
 
                    int fight = scan.nextInt();

                    if (fight > 2 || fight < 1) {
                        System.out.println("�ٽ� �������ּ���.");
                    } if (fight == 1) {
                        while (enemyHP > 0) {
                        System.out.println("������ ü���� " + enemyHP + "���ҽ��ϴ�.");
                        System.out.println(" ");
                        enemyHP = enemyHP - ���ݷ�;
                        }
                        System.out.println("���͸� ��ҽ��ϴ�.");
                        System.out.println("50 ������ ȹ���Ͽ����ϴ�.");
                        System.out.println("HP�� 10 �پ������ϴ�.");
                        HP = HP - 10;
                        System.out.println("HP�� " + HP + "���ҽ��ϴ�.");
                        money += 50;
                        if (HP <= 0) {
                            System.out.println("HP�� 0�� �Ǿ ����Ͽ����ϴ�.");
                            System.out.println("�����Ͱ� ��������ϴ�.");
                            System.out.println("������ ����˴ϴ�.");
                            t = 1;
                            start = 1;
                        }
                    } if (fight == 2) {
                        t = 1; 
                    }
                }

            }
        }

    }
}}}
