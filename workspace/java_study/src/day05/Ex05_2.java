package day05;
/*
 * # 4�� ����� ����
 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
 */
public class Ex05_2 {
	public static void main(String[] args) {
		int[] arr = {44,11,29,24,76};
		int[] temp = null;
		
		int cnt = 0;
		for(int i = 0; i<5; i++) {
			if(arr[i]%4 == 0) {
				cnt+=1;
			}
		}
		
		temp = new int[cnt];
		int j = 0;
		for(int i = 0; i<5; i++) {
			if(arr[i]%4==0) {
				temp[j] = arr[i];
				j++;
			}
		}
		
		for(int i = 0; i<cnt; i++) {
			System.out.print(temp[i]+ " ");
		}
	}
}
