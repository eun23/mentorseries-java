package day04;

public class Equality_sign_operator {
	public static void main(String[] args) {
		double a = 3.14; // 변수 a에 3.14 저장
		double b = 5.15; // 변수 b에 5.14 저장
		System.out.println(a == b); // false
		System.out.println(a != b); // true
		
		String c1 = "Hello JAVA!"; // c1에 문자열 "Hello JAVA!" 저장
		// 문자열 비교시 등가비교연산자(==)를 사용 x
		// 문자열.eqauls(비교문자열)
		// eqauls: String 문자열 클래스 안에 있는 메서드(기능)
		System.out.println(c1 == "Hello JAVA!"); // true
		System.out.println(c1.equals("Hello JAVA!")); // true
		// 대소문자 구분
		System.out.println(c1.equals("hello JAVA!")); // false
	}
}
