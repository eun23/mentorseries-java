package day04;

public class Logic_operator {
	public static void main(String[] args) {
		boolean a = true; // 변수 a에 true 저장
		boolean b = false; // 변수 b에 false 저장
		boolean c = !b; // 변수 c에 변수 b가 true이면 false, false이면 true 저장
		
		System.out.println(a); // true
		System.out.println(!a); // false
		
		System.out.println(b); // false
		System.out.println(c); // true
	}
}
