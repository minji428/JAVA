package day08;
//# 2�����迭 �⺻����[1�ܰ�]
public class Ex08_3 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k+=1;
			}
		}
		
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		int tot = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("tot = "+tot);
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j]+ " ");
				}
			}
		}
		System.out.println();
		
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		tot = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4 == 0) {
					tot = tot + arr[i][j];
				}
			}
		}
		System.out.println("tot = "+tot);
		
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		int cnt = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4 == 0) {
					cnt += 1;
				}
			}
		}
		System.out.println("cnt = "+cnt);
		
	}
}
