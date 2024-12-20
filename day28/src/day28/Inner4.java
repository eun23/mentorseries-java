package day28;

class OuterClass {
	int a = 3;
	static int b = 4;

	class Inner {
		int c = 5;

		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}

	static class StaticInner {
		int d = 6;
		static int stat = 10;

		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class Inner4 {
	public static void main(String[] args) {
		// OuterClass 객체 생성 후 멤버에 접근
		// 인스턴스 멤버 접근: 인스턴스명.변수명
		// static 멤버 접근: 클래스명.변수명
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a의 값: " + oc.a);
		System.out.println("OuterClass의 b의 값: " + OuterClass.b);

		// 인스턴스 내부 클래스 접근
		System.out.println("--- Inner Class 접근하기");
		// 외부 클래스 객체 생성
		OuterClass oc2 = new OuterClass();
		// 외부 클래스 객체로 내부 클래스 객체 생성
		OuterClass.Inner i = oc2.new Inner();

		System.out.println("Inner의 c의 값: " + i.c);
		// 내부 클래스 객체로 메서드 호출
		i.innerMethod();

		// 스태틱 내부 클래스 접근
		// 스태틱 클래스 객체 생성
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값: " + si.d);

//		si.staticMethod(); - 객체를 사용하지 않고 클래스명을 사용해서 호출 가능
		// 스태틱 클래스로 스태틱 메서드 호출
		OuterClass.StaticInner.staticMethod();
	}
}
