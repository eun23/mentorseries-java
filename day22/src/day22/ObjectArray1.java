package day22;

// Aclass 객체를 묶어서 관리할 수 있는 객체 배열 arr을 생성하고 객체 내 필드를 사용
class Aclass {
	int x;

	void f1() {
		System.out.println("f1()");
	}
}

public class ObjectArray1 {
	public static void main(String[] args) {
		// 클래스명 객체배열명[] = new 클래스명[크기];
		Aclass arr[] = new Aclass[3];
		// Error: Aclass 객체 값은 아직 생성되지 않아 필드 사용 불가!
//		arr[0].x = 100;
//		arr[0].f1();

		// 클래스명();을 통해 꼭 객체를 생성해야만 객체 내 필드 접근 가능
		arr[0] = new Aclass();
		arr[0].x = 100;
		arr[0].f1();
		System.out.println(arr[0].x);
	}
}
