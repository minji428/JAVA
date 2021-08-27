package day21;
/*
 * # 클래스의 구성요소
 * [1] 변수
 * [2] 메서드(method)
 */

class Stud {
	void say() {
		System.out.println("안녕하세요");
	}
	void setScore(int score) {
		score = 100;
	}
	int setScore2(int score) {
		score = 100;
		return score;
	}
	int score3;
	void setScore3(int score3) {
		this.score3 = score3;
		System.out.println("this = "+this);
	}

}

public class Ex01_1 {
	public static void main(String[] args) {
		Stud hgd = new Stud();
		// 메서드 호출(사용)되면 stack 메모리에 쌓인다.
		hgd.say();
		
		int score = 87;
		System.out.println("메서드 호출 전의 성적 = "+score);
		
		// 연산자를 받았지만 return이 없기 때문에 main에서 호출된 score의 점수가 그대로 나온다
		hgd.setScore(score);
		System.out.println("메서드 호출 후의 성적 = "+score);
		
		// 방법1)
		System.out.println(hgd.setScore2(score));
		
		// 방법2)
		score = hgd.setScore2(score);
		System.out.println(score);
		
		// 왜 그냥 hgd.setScore2(score);을 쓰면 score이 100으로 변경 x?
		System.out.println("메서드2 호출 후의 성적 = "+score);
		
		
		System.out.println("----------------");
		//---------------------------------
		//this
		
		hgd.score3 = 100;
		
		hgd.setScore3(57);
		System.out.println(hgd.score3);
		
		System.out.println("hgd = "+hgd);
	}
}
