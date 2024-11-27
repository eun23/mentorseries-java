package day03;

public class DataType {
	public static void main(String[] args) {
		int a = 65;
		double d = a; // 자동 형변환
		System.out.println(d); // 65.0
		
		char c = (char)a; // 강제 형변환
		System.out.println(c); // A
	}
}
