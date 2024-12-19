package day25;

public class Downcasting1 {
	public static void main(String[] args) {
		// 업 캐스팅
		Human h1 = new Student("가길동", 20, "게임하기", 3);
//		h1.study();

		// 다운 캐스팅
		Student st1 = (Student) h1;
		st1.study();
	}
}
