package day11;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		int money = 10000;

		System.out.println("현재 가진 돈은 10000원 입니다.");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("얼마를 사용하시겠습니까? ");
			int i = sc.nextInt();

			if (!(0 <= i && i <= money)) {
				System.out.println("다시 입력해주세요(사용범위가 틀렸습니다.)");
				continue;
			}

			System.out.printf("이제 %d원 남았습습니다.\n", money -= i);

			if (money == 0) {
				break;
			}
		}
		System.out.println("남은 돈이 없습니다. 종료!");
	}
}