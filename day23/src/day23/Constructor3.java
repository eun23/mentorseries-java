package day23;

class Bclass {
	String name;

	Bclass(String name) { // 매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자( )");
		this.name = name;
	}
}

public class Constructor3 {
	public static void main(String[] args) {
		Bclass b = new Bclass("홍길동");
		System.out.println(b.name);
	}
}
