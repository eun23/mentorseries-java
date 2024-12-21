package day31;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "Hello";

		// concat: 문자열 연결
		System.out.println(str.concat(" World!"));
		System.out.println(str);

		// substring(시작위치, 끝위치): 시작위치 ~ 끝위치앞
		System.out.println(str.substring(2, 4));
		// 시작위치 ~ 마지막까지
		System.out.println(str.substring(3));

		// length(): 문자열 길이
		System.out.println(str.length());

		// toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// charAt(인덱스), indexOf(문자열), equals(문자열)
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("o"));
		System.out.println("hello".equals(str));
		
		// trim(), replace, replaceAll
		System.out.println("   trim ".trim());
		System.out.println(str.replace('H', 'h'));
		System.out.println(str.replaceAll(str, "Bye"));
	}
}
