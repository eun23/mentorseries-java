package day25;

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		A obj = new B(); // 부모변수 = 자식값: 업 캐스팅
		obj.methodA();
//		obj.methodB(); - Error
	}
}
