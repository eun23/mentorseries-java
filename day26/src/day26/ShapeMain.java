package day26;

abstract class Shape {
//	void draw() {
//		System.out.println("도형을 그리다");
//	}
	abstract void draw();
}

class Rect extends Shape {
	void draw() {
		System.out.println("사각형을 그리다.");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그리다.");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("선을 그리다.");
	}
}

public class ShapeMain {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		// 부모 객체 배열 요소에 자식 값 넣기 -> 업 캐스팅
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();

		for (int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
	}
}
