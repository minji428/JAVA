package day09;
//위 배열에서 중복안된숫자를 제거하시요 
//1) {1,2,1,2}
//2) {4,4}
//3) {1,1,1,1}
public class Ex12_2 {
	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};
		int temp1[] = new int[5];
		int count1 = 0;
		
		for(int i=0; i<5; i++) {
			temp1[count1] = test1[i];
			int check = 0;
			for(int n = 0; n<5; n++) {
				if(i!=n && temp1[count1] == test1[n]) {
					check = 1;
				}
			}
			if(check == 1) {
				count1 += 1;
			}
		}
		for(int i=0; i<count1; i++) {
			System.out.print(temp1[i]+" ");
		}
		System.out.println();
		
		
		int test2[] = {1,3,4,4,2};
		int temp2[] = new int[5];
		int count2 = 0;
		
		for(int i=0; i<5; i++) {
			temp2[count2] = test2[i];
			int check = 0;
			for(int n = 0; n<5; n++) {
				if(i!=n && temp2[count2] == test2[n]) {
					check =1;
				}
			}
			if(check == 1) {
				count2 += 1;
			}
		}
		for(int i=0; i<count2; i++) {
			System.out.print(temp2[i]+" ");
		}
		System.out.println();
		
		int test3[] = {1,1,1,2,1};
		int temp3[] = new int[5];
		int count3 = 0;
		
		for(int i=0; i<5; i++) {
			temp3[count3] = test3[i];
			int check = 0;
			for(int n=0; n<5; n++) {
				if(i!=n && temp3[count3] == test3[n]) {
					check =1;
				}
			}
			if(check ==1) {
				count3 += 1;
			}
		}
		for(int i=0; i<count3; i++) {
			System.out.print(temp3[i]+" ");
		}
		System.out.println();
		
	}
}
