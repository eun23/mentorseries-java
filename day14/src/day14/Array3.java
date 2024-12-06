package day14;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int[4][3];
		String subject[] = { "국어", "영어", "수학" };

//		System.out.println("--- 1번 학생 점수 ---");
//		
//		System.out.print(subject[0] + ": ");
//		scores[0][0] = sc.nextInt();
//		
//		System.out.print(subject[1] + ": ");
//		scores[0][1] = sc.nextInt();
//		
//		System.out.print(subject[2] + ": ");
//		scores[0][2] = sc.nextInt();

		// 2차원 배열 활용해서 사용자에게 입력받은 값 저장하는 방법
		for (int i = 0; i < 3; i++) {
			System.out.println("--- " + (i + 1) + "번 학생 점수 ---");
			for (int j = 0; j < 3; j++) {
				System.out.print(subject[j] + ": ");
				scores[i][j] = sc.nextInt();
			}
		}

		// 2차원 배열에 저장된 값을 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "번: \t");
			for (int j = 0; j < 3; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
