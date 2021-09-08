package day32;

abstract class Shape{
	int x, y;
	public void move() {
		
	}
	public abstract void draw();
}

// Shape 클래스를 상속받아 Point 클래스를 만든다
class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("점을 찍는다");
	}
}

// Shape 클래스를 상속받아 Line 클래스를 만든다
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("선을 그린다");
	}
}

// Shape 클래스를 상속받아 Circle 클래스를 만든다.
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}
public class Ex06_2 {

}
