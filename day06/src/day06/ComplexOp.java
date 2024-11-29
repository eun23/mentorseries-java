package day06;

public class ComplexOp {
	public static void main(String[] args) {
		int x = 10;
		x = x + 10;
		System.out.println(x); // 20
		
		// 복합대입연산자
		// 연산자의 연산 순서
		// 산술 -> 대입
		int y = 10;
		y += 10; // y = y + 10;
		System.out.println(y); // 20
	}
}
