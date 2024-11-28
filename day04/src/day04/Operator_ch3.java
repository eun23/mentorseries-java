package day04;

public class Operator_ch3 {
	public static void main(String[] args) {
		int a = 1; // 변수 a에 1을 저장
		System.out.println(a); // 1
		
		a++; // a의 값 1증가: 후위형
		System.out.println(a); // 2
		
		// a의 값 1증가: 전위형
		System.out.println(++a); // 3
		// a의 값 1증가: 후위형
		System.out.println(a++); // 3
		System.out.println(a); // 4
	}
}
