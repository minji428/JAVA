package day21;
//# �л��������� ���α׷�[1�ܰ�] : Ŭ���� + �޼���

class Ex08{
	int test1(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	int test2(int[] arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				total += arr[i];
			}
		}
		return total;
	}
	int test3(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4==0) {
				cnt += 1;
			}
		}
		return cnt;
	}
	int test4(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				cnt += 1;
			}
		}
		return cnt;
	}
	
}

public class Ex05_1 {
	public static void main(String[] args) {
		Ex08 e = new Ex08();
		
		int[] arr = {87, 100, 11, 72, 92};

		// ���� 1) ��ü �� ����
		// ���� 1) 362
		int total1 = e.test1(arr);
		System.out.println("����1 = "+total1);

		// ���� 2) 4�� ����� �� ����
		// ���� 2) 264
		int total2 = e.test2(arr);
		System.out.println("����2 = "+total2);
		
		// ���� 3) 4�� ����� ���� ����
		// ���� 3) 3
		int cnt1 = e.test3(arr);
		System.out.println("����3 = "+cnt1);
		
		// ���� 4) ¦���� ���� ����
		// ���� 4) 3
		int cnt2 = e.test4(arr);
		System.out.println("����4 = "+cnt2);

	}
}
