package day09;
/*
 * # ���ڿ� [�Է¹ޱ�]
 * . ���ڳ� ����ܾ� �Է� �� Ŀ���� �ű� �ʿ䰡 ����.
 * . ��, �ѱ� �Է� �� �ݵ�� Ŀ���� ������ �ű� �� �ۼ��ؾ� �Ѵ�.
 */
/*
 * # ���ڿ� [��]
 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
 */
/*
 * # ���ڿ�[����]
 * 1. compareTo() �޼���
 * 2. 2���� ���ڿ��� ���� int�� ���� ��ȯ�ϴ� �޼���
 * 3. A.compareTo(B)
 * 4. ���
 * 		A�� B�� ������						0
 *      A�� B���� ���������� ������ ���̸�		����
 *      A���� B�� ���������� ������ ���̸�		���
 *      
 */



import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//[�Է¹ޱ�]
		/*System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		
		System.out.println("name = "+name);
		*/
		
		//[��]
		/*String name = "ȫ�浿";
		System.out.print("�̸��� �Է��ϼ��� : ");
		String myName = scan.next();
		
		if(name == myName) {
			System.out.println("== ������ : ��ġ");
		}
		else {
			System.out.println("== ������ : ����ġ");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals() �޼��� : ��ġ");
		}
		else {
			System.out.println("equal() �޼��� : ����ġ");
		}*/
		
		//[����]
		/*String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);
		
		int rs3 = str3.compareTo(str1);
		System.out.println(rs3);
		*/
		
		String[] names = {"ȫ�浿", "������", "������", "�ڹ�ŷ", "������"};
		for(int i=0; i<names.length; i++) {
			String minName = names[i];
			int minIdx = i;
			for(int j=i; j<names.length; j++) {
				if(minName.compareTo(names[j])>0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		
		
		scan.close();
	}
}
