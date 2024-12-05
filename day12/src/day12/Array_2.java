package day12;

import java.util.Arrays;

public class Array_2 {
	public static void main(String[] args) {
		// 배열 생성과 동시에 초기값 저장
		int[] a = new int[] { 10, 20, 4, 25, 18 };
		// new int[] 생략 가능
		int[] b = { 1, 2, 3, 4, 5, 6, 7 };
		// 타입 배열명[] 가능
		int c[] = new int[10];

		// 배열 c에 값 저장
		// 배열.length: 배열의 길이 구하기
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		// 배열 c 출력
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		// Arrays.toString(배열명): 배열의 요소를 문자열로 출력하기
		System.out.println(Arrays.toString(c));
	}
}
