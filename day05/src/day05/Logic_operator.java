package day05;

public class Logic_operator {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		// a, b 모두 true면 true
		System.out.println(a && b); // false
		// a, c 모두 true면 true
		System.out.println(a && c); // true
		System.out.println((a && c) && (a && b)); // false
		
		// a, b 중 하나라도 true면 true
		System.out.println(a || b); // true
		// a, c 중 하나라도 true면 true
		System.out.println(a || c); // true
		System.out.println((a && b) || (b && c)); // false
		
		// a가 true면 false, false면 true
		System.out.println(!a); // false
	}
}
