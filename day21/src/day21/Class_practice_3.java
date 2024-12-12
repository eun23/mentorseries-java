package day21;

class Car {
	static int wheel = 4; // 클래스 변수
	int speed; // 인스턴스 변수
}

public class Class_practice_3 {
	public static void main(String[] args) {
		System.out.println(Car.wheel);
//		System.out.println(Car.speed); - Error: 인스턴스 변수

		Car myCar1 = new Car();
		System.out.println(myCar1.speed);

		Car myCar2 = new Car();
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed: " + myCar1.speed);
		System.out.println("myCar2.speed: " + myCar2.speed);
		System.out.println("myCar1.wheel: " + myCar1.wheel);
		System.out.println("myCar2.wheel: " + myCar2.wheel);

		myCar2.speed = 100;
		// 클래스 변수는 같은 주소(저장공간)를 공유하기 때문에 동일한 값을 가진다.
		myCar2.wheel = 5;
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed: " + myCar1.speed);
		System.out.println("myCar2.speed: " + myCar2.speed);
		System.out.println("myCar1.wheel: " + myCar1.wheel);
		System.out.println("myCar2.wheel: " + myCar2.wheel);
	}
}
