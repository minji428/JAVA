package day26;

// 생성자 적용 전

class Book{
	String title;	// 책 제목
	String author;	// 책 저자
	int price;	// 책 가격
	
	void setData(String title, int price) {
		// this.title = title;
		// author = "작자미상";
		// this.price = price;
		
		setData(title, "작자미상", price);
	}
	void setData(String title, String author, int price) {
		this.title = title;
		this.author = "작자미상";
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"원)");
	}
}

// 생성자 적용 후
class AfterBook{
	String title;
	String author;
	int price;

	// 기본 생성자
	AfterBook(){}
	AfterBook(String title, int price){
		this(title,"작자미상",price);
	}
	AfterBook(String title, String author, int price){
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"원)");
	}
}


public class Ex04_3 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setData("자바의 정석", "남궁성", 27000);
		b1.showInfo();
		
		Book b2 = new Book();
		b2.setData("춘향전", 9000);
		b2.showInfo();
		
		AfterBook ab1 = new AfterBook("자바의 정석", "남궁성", 27000);
		ab1.showInfo();
		AfterBook ab2 = new AfterBook("춘향전", 9000);
		ab2.showInfo();
		
	}
}
