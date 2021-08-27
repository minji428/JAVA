package day21;

class Ex05{
	int test1(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				cnt += 1;
			}
		}
		return cnt;
	}
	
	int[] test2(int[] arr) {
		int cnt = test1(arr);
		int[] tmp = new int[cnt];
		
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				tmp[j] = arr[i];
				j += 1;
			}
		}
		return tmp;
	}
	
	void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class Ex03_3 {
	public static void main(String[] args) {
		
		Ex05 e = new Ex05();
		
		int[] arr = {87,12,21,56,100};
		
		// ����1) 4�� ����� ������ �������ִ� �޼���
		int cnt = e.test1(arr);
		System.out.println("cnt = "+cnt);
		
		// ����2) 4�� ����� �迭 Ÿ������ �������ִ� �޼���
		int[] temp = e.test2(arr);
		e.print(temp);
	}
}
