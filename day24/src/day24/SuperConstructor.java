package day24;

class Car {
	int wheel;
	int speed;
	String color;
	
//	Car() {} // - Error 해결1

	Car(String color) {
		this.color = color;
	}
}

class SportsCar extends Car {
	int speedLimit;

	SportsCar(String color, int speedLimit) { // - Error
		// 자식 클래스에서 생성자 호출 시,
		// 부모 클래스의 디폴트 생성자가 자동으로 호출되기 때문에
		// 부모의 디폴트 생성자가 존재해야 한다.
		super(color); // - Error 헤결2
//		this.color = color;
		this.speedLimit = speedLimit;
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}
}
