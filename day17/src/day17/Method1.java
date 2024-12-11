package day17;

public class Method1 {
	static void open() {
		System.out.println("문 열기");
		System.out.println("바닥 청소");
		System.out.println("포스키 켜기");
		System.out.println("빵 진열");
	}
	
	static void f1 (int x) {
		// 함수 호출 시 값을 전달받아서, 전달받은 값을 출력하자
		System.out.println("x: " + x);
	}

	public static void main(String[] args) {
		open();
		f1(100);
	}
}
