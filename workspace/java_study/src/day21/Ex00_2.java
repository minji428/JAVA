package day21;

class Stu {
	String name;
}

public class Ex00_2 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		int[] 	nums = {n1, n2, n3};
		
		Stu s1 = new Stu();
		Stu s2 = new Stu();
		Stu s3 = new Stu();
		
		Stu[] students = {s1, s2, s3};
		
		//---------------------------------
		
		Stu[] arr = new Stu[3];
		
		// Student[] arr = new Student[3] 처럼 쓰면 오류가 나기 때문에
		// for(int i ... 구문을 꼭 써줘야 한다
		// 이유는 그냥 []를 쓰면 null이기 때문에 null.name = "홍길동"을 한 것과 같기 때문에
		// 오류가 난다
		//----------------------------
		for(int i=0; i<3; i++) {
			arr[i] = new Stu();
		}
		//----------------------------
		arr[0].name = "홍길동";
		
	}
}
