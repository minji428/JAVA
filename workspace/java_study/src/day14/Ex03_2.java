package day14;
//# ���ڿ� 2����
public class Ex03_2 {
	public static void main(String[] args) {
		
		String[] name = {"��ö��", "�̸���", "�̿���"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for(int i=0; i<name.length; i++) {
			str += name[i];
			str += "/";
			str += score[i] + "";
			if(i!= name.length-1) {
				str+=",";
			}
		}
		System.out.println(str);
	}
}
