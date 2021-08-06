package day05;

public class Ex04_1 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int temp4[] = new int[5];
		
		int i = 0;
		int back = 4;
		//temp4[i] = arr[back];
		
		while(i<5) {
			temp4[back] = arr[i];
			back-=1;
			i++;
		}
		i=0;
		while(i<5) {
			System.out.println(temp4[i]);
			i++;
		}
	}
}
