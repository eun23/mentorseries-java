package day02;
// 입력기능을 코드에 연결
import java.util.Scanner;
public class Day02input {
	public static void main(String[] args) {
		// Scanner를 sc라는 이름으로 사용
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next()); // 문자열
		System.out.println(sc.nextInt()); // 정수형
		System.out.println(sc.nextFloat()); // 실수형
		System.out.println(sc.nextLine()); // 문자열
	}

}
