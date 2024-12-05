package day13;

import java.util.*;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int lottoArr[] = new int[6];
		int userArr[] = new int[6];
		int bonus;
		boolean isBonus = false;
		int count = 0;

		// 보너스 번호 추첨
		bonus = random.nextInt(45) + 1;
//		System.out.println("bonus: " + bonus); // test

		for (int i = 0; i < 6; i++) {
			// 로또 번호 추첨
			lottoArr[i] = random.nextInt(45) + 1; // 1 ~ 45
//			System.out.println(lottoArr[i]); // test

			// 로또 번호와 중복되면 보너스 번호 다시 추첨
			if (lottoArr[i] == bonus) {
				bonus = random.nextInt(45) + 1;
//				System.out.println("bonus: " +bonus); // test
			}
		}

		// 사용자에게 6개의 숫자 입력 받기
		System.out.println("숫자 6개를 입력해주세요(1 ~ 45): ");
		for (int i = 0; i < 6; i++) {
			userArr[i] = sc.nextInt();
		}

		// 로또 배열의 값과 사용자 배열의 값을 비교해서 같은 값 카운팅
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lottoArr[i] == userArr[j]) {
					count++;
				}
			}
		}

		// 보너스 번호 확인
		for (int i = 0; i < 6; i++) {
			if (bonus == userArr[i]) {
				isBonus = true;
			}
		}

		// 결과 확인
		System.out.print("로또 추첨 번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoArr[i] + " ");
		}
		System.out.println("");
		
		System.out.println("보너스 번호: " + bonus);
		
		System.out.print("사용자 입력 번호: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(userArr[i] + " ");
		}
		System.out.println("");
		
		// 당첨 발표
		if (count == 6) {
			System.out.println("축하드립니다! 1등입니다!");
		} else if (count == 5) {
			if (isBonus == true) {
				System.out.println("축하드립니다! 2등입니다!");
			} else {
				System.out.println("축하드립니다! 3등입니다!");
			}
		} else if (count == 4) {
			System.out.println("축하드립니다! 4등입니다!");
		} else if (count == 3) {
			System.out.println("축하드립니다! 5등입니다!");
		} else {
			System.out.println("낙첨입니다.");
		}
	}
}
