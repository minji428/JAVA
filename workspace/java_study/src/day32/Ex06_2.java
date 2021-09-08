package day32;

abstract class Shape{
	int x, y;
	public void move() {
		
	}
	public abstract void draw();
}

// Shape Ŭ������ ��ӹ޾� Point Ŭ������ �����
class Point extends Shape{
	@Override
	public void draw() {
		System.out.println("���� ��´�");
	}
}

// Shape Ŭ������ ��ӹ޾� Line Ŭ������ �����
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
}

// Shape Ŭ������ ��ӹ޾� Circle Ŭ������ �����.
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
}
public class Ex06_2 {

}
