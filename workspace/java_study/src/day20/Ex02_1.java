package day20;
//# �л��������� ���α׷�[1�ܰ�] : Ŭ���� + ����

class Ex03{
	int[] arr = {87,100,11,72,92};
}
public class Ex02_1 {
	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		// ���� 1) ��ü �� ���
		// ���� 1) 362
		int tot = 0;
		for(int i=0; i<e.arr.length; i++) {
			tot += e.arr[i];
		}
		System.out.println("tot = "+tot);
		// ���� 2) 4�� ����� �� ���
		// ���� 2) 264
		tot = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%4==0) {
				tot += e.arr[i];
			}
		}
		System.out.println("4�� ��� �� = "+tot);
		
		// ���� 3) 4�� ����� ���� ���
		// ���� 3) 3
		int cnt = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%4 == 0) {
				cnt += 1;
			}
		}
		System.out.println("4�� ����� ���� = "+cnt);
		
		// ���� 4) ¦���� ���� ���
		// ���� 4) 3
		cnt = 0;
		for(int i=0; i<e.arr.length; i++) {
			if(e.arr[i]%2 == 0) {
				cnt += 1;
			}
		}
		System.out.println("¦���� ���� = "+cnt);
	}
}
