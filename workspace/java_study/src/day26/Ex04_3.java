package day26;

// ������ ���� ��

class Book{
	String title;	// å ����
	String author;	// å ����
	int price;	// å ����
	
	void setData(String title, int price) {
		// this.title = title;
		// author = "���ڹ̻�";
		// this.price = price;
		
		setData(title, "���ڹ̻�", price);
	}
	void setData(String title, String author, int price) {
		this.title = title;
		this.author = "���ڹ̻�";
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"��)");
	}
}

// ������ ���� ��
class AfterBook{
	String title;
	String author;
	int price;

	// �⺻ ������
	AfterBook(){}
	AfterBook(String title, int price){
		this(title,"���ڹ̻�",price);
	}
	AfterBook(String title, String author, int price){
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println(title+":"+author+"("+price+"��)");
	}
}


public class Ex04_3 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setData("�ڹ��� ����", "���ü�", 27000);
		b1.showInfo();
		
		Book b2 = new Book();
		b2.setData("������", 9000);
		b2.showInfo();
		
		AfterBook ab1 = new AfterBook("�ڹ��� ����", "���ü�", 27000);
		ab1.showInfo();
		AfterBook ab2 = new AfterBook("������", 9000);
		ab2.showInfo();
		
	}
}
