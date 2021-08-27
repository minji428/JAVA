package day21;
/*
 * # �޼����� ����[2�ܰ�]
 * void print(�Ű�����[parameter]){
 * 		������ ����;
 * } 
 *
 * # �޼����� ���(ȣ��)
 * print(����,�μ�[argument]);
 */

class Ex02_1{
	void test1(int x, int y) {
		int total = 0;
		for(int i=x; i<=y; i++) {
			total += i;
		}
		System.out.println("total = "+total);
	}
	
	void test2(int[] arr) {
		int maxNum = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("�ִ밪 = "+maxNum);
	}
	
	void test3(int[]arr, int idx1, int idx2) {
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}
	
	void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Ex02_1 e = new Ex02_1();
		
		
		// ����1) x���� y������ ���� ����ϴ� �޼���
		int x = 1;
		int y = 10;
		e.test1(x,y);
		
		// ����2) arr�迭�� ���޹޾� �ִ밪�� ����ϴ� �޼���
		int[] arr = {87,100,35,12,46};
		e.test2(arr);
		
		// ����3) arr�迭�� ���޹޾� �ε��� 2���� �Է¹ް�, �ش� ��ġ�� ���� ��ü�ϴ� �޼���
		e.print(arr);
		
		int idx1 = 1;
		int idx2 = 4;
		e.test3(arr, idx1, idx2);
		e.print(arr);
	}
}
