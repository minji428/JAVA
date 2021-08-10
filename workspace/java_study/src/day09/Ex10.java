package day09;
/*
 * # 문자열 [입력받기]
 * . 숫자나 영어단어 입력 시 커서를 옮길 필요가 없다.
 * . 단, 한글 입력 시 반드시 커서를 끝으로 옮긴 후 작성해야 한다.
 */
/*
 * # 문자열 [비교]
 * . 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
 */
/*
 * # 문자열[정렬]
 * 1. compareTo() 메서드
 * 2. 2개의 문자열을 비교해 int형 값을 반환하는 메서드
 * 3. A.compareTo(B)
 * 4. 결과
 * 		A와 B가 같으면						0
 *      A가 B보다 사전적으로 순서가 앞이면		음수
 *      A보다 B가 사전적으로 순서가 앞이면		양수
 *      
 */



import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//[입력받기]
		/*System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.println("name = "+name);
		*/
		
		//[비교]
		/*String name = "홍길동";
		System.out.print("이름을 입력하세요 : ");
		String myName = scan.next();
		
		if(name == myName) {
			System.out.println("== 연산자 : 일치");
		}
		else {
			System.out.println("== 연산자 : 불일치");
		}
		
		if(name.equals(myName)) {
			System.out.println("equals() 메서드 : 일치");
		}
		else {
			System.out.println("equal() 메서드 : 불일치");
		}*/
		
		//[정렬]
		/*String str1 = "가";
		String str2 = "나";
		String str3 = "다";
		
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);
		
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);
		
		int rs3 = str3.compareTo(str1);
		System.out.println(rs3);
		*/
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		for(int i=0; i<names.length; i++) {
			String minName = names[i];
			int minIdx = i;
			for(int j=i; j<names.length; j++) {
				if(minName.compareTo(names[j])>0) {
					minName = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		
		
		scan.close();
	}
}
