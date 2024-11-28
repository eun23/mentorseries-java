package day04;

public class Inequlity_sign_operator {
	public static void main(String[] args) {
		int a = 10; // 변수 a에 10 저장
		int b = 20; // 변수 b에 20 저장
		int c = 30; // 변수 c에 30 저장
		
		// a가 b보다 작아?
		System.out.println(a < b); // true
		// a가 b보다 커?
		System.out.println(a > b); // false
		// a + b가 c보다 작거나 같아?
		System.out.println(a + b <= c); // true
		// a + b가 c보다 크거나 같아?
		System.out.println(a + b >= c); // true
	}
}
