package day28;

abstract class Abstract {
	abstract void f2();
}

public class Anonymous4 {
	public static void main(String[] args) {
		Abstract ab = new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	}
}
