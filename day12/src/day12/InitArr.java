package day12;

public class InitArr {
	public static void main(String[] args) {
		int arrInt[] = new int[3];
		double arrDouble[] = new double[3];
		char arrChar[] = new char[3];
		String arrString[] = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arrInt[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arrDouble[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arrChar[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arrString[i] + " ");
		}
	}
}
