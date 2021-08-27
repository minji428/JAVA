package day21;
//# �л��������� ���α׷�[2�ܰ�] : Ŭ���� + �޼���

import java.util.Random;

class Student{
	int hakbun;
	int score;
}

class Ex09{
	void test1(int[] x) {
		Random ran = new Random();
		
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	
	int test2(int[] x) {
		int total = 0;
		for(int i=0; i<x.length; i++) {
			total += x[i];
		}
		return total;
	}
	
	double test3(int[] x) {
		double avg = test2(x)/(double)x.length;	
		return avg;
	}
	
	int test4(int[] x) {
		int cnt = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] >= 60) {
				cnt += 1;
			}
		}
		return cnt;
	}
	
	int test5(int[] x, int idx) {
		int score = 0;
		for(int i=0; i<x.length; i++) {
			if(i==idx) {
				score = x[i];
			}
		}
		return score;
	}
	
	int test6(int[] x, int score) {
		int idx = -1;
		for(int i=0; i<x.length; i++) {
			if(x[i]==score) {
				idx = i;
			}
		}
		return idx;
	}
	
	int test7(int[] x, int[] y, int hakbun) {
		int score = -1;
		for(int i=0; i<x.length; i++) {
			if(x[i] == hakbun) {
				score = y[i];
			}
		}
		
		return score;
	}
	
	Student test8(int[] x, int[] y) {
		int maxScore = 0;
		int maxIdx = 0;
		for(int i=0; i<x.length; i++) {
			if(maxScore < y[i]) {
				maxScore = y[i];
				maxIdx = i;
			}
		}
		Student temp = new Student();
		temp.hakbun = x[maxIdx];
		temp.score = y[maxIdx];
		return temp;
	}
}

public class Ex05_2 {
	public static void main(String[] args) {

		Ex09 e = new Ex09();
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = new int[5];

		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ���� �޼���
		// ��   1) 87, 11, 92, 14, 47
		e.test1(scores);

		// ����2) �������� ���� ���� �޼���
		// ��   2) ����(251) ���(50.2)
		int tot = e.test2(scores);
		System.out.println("tot = " + tot);
		
		// ����3) �������� ��� ���� �޼���
		// ��   3) ���(50.2)
		double avg = e.test3(scores);
		System.out.println("avg = " + avg);
		
		// ����4) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���� �޼���
		// ��   4) 2��
		int cnt = e.test4(scores);
		System.out.println("cnt = " + cnt);

		// ����5) �ε����� ���޹޾� ���� ���� �޼���
		// ����5) �ε��� �Է� : 1	���� : 11��
		int score = e.test5(scores, 1);
		System.out.println("score = " + score);
		
		// ����6) ������ ���޹޾� �ε��� ���� �޼���
		//		  ��, ���� ���� �Է� �� ����ó��
		// ����6) ���� �Է� : 11	�ε��� : 1
		int idx = e.test6(scores, 11);
		if(idx == -1) {
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}else {
			System.out.println("idx = " + idx);
		}
		
		// ����7) �й��� ���޹޾� ���� ���� �޼���
		// 		  ��, �����й� �Է� �� ����ó��
		// ��   7)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش� �й��� �������� �ʽ��ϴ�.
		score = e.test7(hakbuns, scores, 1001);
		if(score == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("score = " + score);
		}
		
		// ����8) 1���л��� �й��� ������ Ŭ���� Ÿ��(Student Ŭ����)���� ���� �޼���
		// ����8) 1004��(98��)
		Student temp = e.test8(hakbuns, scores);
		System.out.println(temp.hakbun + "(" + temp.score + ")��");

	}
}
