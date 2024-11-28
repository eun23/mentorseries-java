package day04;

public class Operator {
	public static void main(String[] args) {
		int a = 10; // 변수 a에 10을 저장
		int b = 3; // 변수 b에 3을 저장
		double doubleB = 3; // 자동 형변환
		
		System.out.println(a + b); // 13
		System.out.println(a - b); // 7
		System.out.println(a * b); // 30
		System.out.println(a / b); // 3
		System.out.println(a % b); // 1
		
		// 정수 /(%) 정수 = 정수
		// 정수 /(%) 실수 = 실수
		System.out.println(a / doubleB); // 3.3333333333333335
		System.out.println(a % doubleB); // 1.0
	}
}