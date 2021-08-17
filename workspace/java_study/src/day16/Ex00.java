package day16;

import java.io.FileWriter;
import java.io.IOException;

public class Ex00 {
	public static void main(String[] args) {
		
		// 비쥬얼객체지향
		// 파이썬 프로그래밍
		// 닷넷 프로그래밍
		
		FileWriter fw = null;
		try 
		{
			
			// 에러발생!!!!
			
			fw = new FileWriter("ex02.txt");
			
			fw.write("테스트");
			
			// 에러발생!!!
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 에러발생여지와 무관하게 무조건 실행할 코드
			// 실제로 실무에서 쓰이는 코드
			// try에서 fw.close();를 만나기 전에 에러가 발생하면 fw.close();까지 오지 않기 때문에
			// fw.close()에 해당하는 문장을 finally에 써준다
			// 아래가 실무에서 쓰이는 코드
			if(fw != null) {try {fw.close();} catch (IOException e) {}}
		}	
	}
}
