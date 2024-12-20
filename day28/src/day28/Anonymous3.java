package day28;

interface Inter1 {
	void f1();
}

// 일반 클래스
//class InterImpl implements Inter1 {
//	@Override
//	public void f1() {
//		
//	}
//}

public class Anonymous3 {
	public static void main(String[] args) {
		// 인터페이스는 객체를 생성할 수 x
		Inter1 it = new Inter1() {
			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}
		};
		it.f1();
	}
}
