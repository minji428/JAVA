package day21;
/*
 * # Ŭ������ �������
 * [1] ����
 * [2] �޼���(method)
 */

class Stud {
	void say() {
		System.out.println("�ȳ��ϼ���");
	}
	void setScore(int score) {
		score = 100;
	}
	int setScore2(int score) {
		score = 100;
		return score;
	}
	int score3;
	void setScore3(int score3) {
		this.score3 = score3;
		System.out.println("this = "+this);
	}

}

public class Ex01_1 {
	public static void main(String[] args) {
		Stud hgd = new Stud();
		// �޼��� ȣ��(���)�Ǹ� stack �޸𸮿� ���δ�.
		hgd.say();
		
		int score = 87;
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
		
		// �����ڸ� �޾����� return�� ���� ������ main���� ȣ��� score�� ������ �״�� ���´�
		hgd.setScore(score);
		System.out.println("�޼��� ȣ�� ���� ���� = "+score);
		
		// ���1)
		System.out.println(hgd.setScore2(score));
		
		// ���2)
		score = hgd.setScore2(score);
		System.out.println(score);
		
		// �� �׳� hgd.setScore2(score);�� ���� score�� 100���� ���� x?
		System.out.println("�޼���2 ȣ�� ���� ���� = "+score);
		
		
		System.out.println("----------------");
		//---------------------------------
		//this
		
		hgd.score3 = 100;
		
		hgd.setScore3(57);
		System.out.println(hgd.score3);
		
		System.out.println("hgd = "+hgd);
	}
}
