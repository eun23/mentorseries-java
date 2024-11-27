package day02;

public class Day02Ex {
	public static void main(String[] args) {
		// 자동완성: sysout + Ctrl + Space
		System.out.println("Hello World!");
		
		// 줄 복사: Alt + Ctrl + 방향키
		System.out.print("문자열값"); // 문자열
		System.out.print('A'); // 문자형
		System.out.print(100); // 정수형
		System.out.print(3.14); // 실수형
		
		System.out.println("문자열값"); // 문자열
		System.out.println('A'); // 문자형
		System.out.println(100); // 정수형
		System.out.println(3.14); // 실수형
		
		// format: 형식지정자 -> %알파벳
		System.out.printf("%s", "문자열값"); // 문자열: String
		System.out.printf("%c", 'a'); // 문자형: Character
		System.out.printf("%d", 100); // 정수형: Decimal
		System.out.printf("%f", 3.14); // 실수형: Float
		
		// 정수값을 문자형으로 출력하면?
		System.out.printf("%c", 65); // A (아스키코드값)
	}
}
