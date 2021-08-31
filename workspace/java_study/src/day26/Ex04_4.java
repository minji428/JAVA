package day26;

class Car{
	String color;
	String type;
	int door;
	
	// 기본 생성자
	Car(){
		this("while","auto",4);
	}
	
	// 생성자 오버로딩
	Car(String color, String type, int door){
		this.color = color;
		this.type = type;
		this.door = door;
	}
	
	// 생성자 오버로딩
	Car(Car c){
		color = c.color;
		type = c.type;
		door = c.door;
	}
	void showInfo() {
		System.out.println(color+" : "+type+" : "+door);
	}
}

public class Ex04_4 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.showInfo();
		
		Car c2 = new Car(c1);
		c2.showInfo();
		
		c2.color = "red";
		c2.showInfo();		
	}


}
