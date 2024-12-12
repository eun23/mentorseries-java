package day20;

// 같은 패키지 내에 있는 클래스명과 동일한 클래스 생성 x
// 같은 패키지 내에 있는 클래스 사용 가능

public class Car_practice_2 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();

		myCar1.color = "Red";
		myCar2.color = "Black";

		myCar1.speedUp();

		myCar2.wiper();

		System.out.println("myCar1의 색: " + myCar1.color);
		System.out.println("myCar2의 색: " + myCar2.color);

		System.out.println("myCar1의 속도: " + myCar1.speed);
		System.out.println("myCar2의 속도: " + myCar2.speed);

		System.out.println("mycar1의 와이퍼 작동 여부: " + myCar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부: " + myCar2.wiperOn);
	}
}
