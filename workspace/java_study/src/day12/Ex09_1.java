package day12;

public class Ex09_1 {
	public static void main(String[] args) {
		
		
		//몇층 까지 내려갈 것인지
		int n = 1;

		while(n<10) {
			int j=0; 
			while(j<10-n) {
				System.out.print(" ");
				j = j+1;
			}
			
			int k=0;
			while(k<n) {
				System.out.print(n+" ");
				k = k+1;
			}
			System.out.println();
			n = n+1;
		}
	
	}
}
