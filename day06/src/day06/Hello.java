package day06;

public class Hello {
	public static void main(String[] args) {
		String s = "Hello";
		int i = 3;
		float f = 3.14f;
		double d = 3.14;
		char c = 'a';
		
		System.out.println(s instanceof String); // true
//		System.out.println(i instanceof Integer); - Error: 객체 타입 x
		System.out.println(Integer.valueOf(i) instanceof Integer); // true
		System.out.println(Float.valueOf(f) instanceof Float); // true
		System.out.println(Double.valueOf(d) instanceof Double); // true
		System.out.println(Character.valueOf(c) instanceof Character); // true
	}
}
