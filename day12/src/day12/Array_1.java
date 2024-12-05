package day12;

public class Array_1 {
	public static void main(String[] args) {
		// 3명의 학생 점수 저장
		int score1 = 100;
		int score2 = 80;
		int score3 = 70;

		System.out.println("학생1의 점수: " + score1 + "점");
		System.out.println("학생2의 점수: " + score2 + "점");
		System.out.println("학생3의 점수: " + score3 + "점");

		System.out.println();

		int scores[] = new int[3];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;

//		System.out.println("학생1의 점수: " + scores[0] + "점");
//		System.out.println("학생2의 점수: " + scores[1] + "점");
//		System.out.println("학생3의 점수: " + scores[2] + "점");

		for (int i = 0; i < 3; i++) {
			System.out.println("학생" + (i + 1) + "의 점수: " + scores[i] + "점");
		}
	}
}
