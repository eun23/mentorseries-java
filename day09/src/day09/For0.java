package day09;

public class For0 {
	public static void main(String[] args) {
//		// 1번부터 10번까지 컴퓨터를 켜달라고 요청하려면?
//		System.out.println("1번 컴퓨터 켜줘");
//		System.out.println("2번 컴퓨터 켜줘");
//		System.out.println("3번 컴퓨터 켜줘");
//		System.out.println("4번 컴퓨터 켜줘");
//		System.out.println("5번 컴퓨터 켜줘");
//		System.out.println("6번 컴퓨터 켜줘");
//		System.out.println("7번 컴퓨터 켜줘");
//		System.out.println("8번 컴퓨터 켜줘");
//		System.out.println("9번 컴퓨터 켜줘");
//		System.out.println("10번 컴퓨터 켜줘");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번 컴퓨터 켜줘!");
		}

		System.out.println();

		// 10번부터 1번까지 컴퓨터 켜줘
		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "번 컴퓨터 켜줘!");
		}

		System.out.println();

		// 1번부터 10번까지 짝수번 컴퓨터를 켜줘
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "번 컴퓨터 켜줘!");
			}
		}
		
		System.out.println();

		// 1번부터 10번까지 홀수번 컴퓨터를 켜줘
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + "번 컴퓨터 켜줘!");
		}
	}
}
