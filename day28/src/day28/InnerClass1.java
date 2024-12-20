package day28;

class A {
	static class StaticInner {
	}

	class InstanceInner {
	}

	// 객체 생성
	StaticInner st1 = new StaticInner();
	InstanceInner ii1 = new InstanceInner();

	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); - Error: static 메서드는 인스턴스 멤버에 접근 불가능
	}

	void InstanceMethod() {
		// 인스턴스 메서드는 스태틱 클래스, 인스턴스 클래스 모두 접근 가능
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}

public class InnerClass1 {
	public static void main(String[] args) {

	}
}
