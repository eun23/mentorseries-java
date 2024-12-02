package day09;

public class For2 {
	public static void main(String[] args) {
		// 1부터 10까지의 합을 계산해서 출력
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("i=%d, sum=%d\n", i, sum);
		}
	}
}
