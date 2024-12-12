package day22;

// Animal 클래스로 만들어진 객체를 묶어서 관리할 객체 배열 animals 생성

class Animal {
	String kind;
	String name;
	int age;

	void info() {
		System.out.println("kind: " + kind);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

public class AnimalObject {
	public static void main(String[] args) {
		Animal animals[] = new Animal[3];

		for (int i = 0; i < 3; i++) {
			animals[i] = new Animal();
		}

		animals[0].kind = "고양이";
		animals[0].name = "나비";
		animals[0].age = 1;

		animals[1].kind = "강아지";
		animals[1].name = "코코";
		animals[1].age = 3;

		animals[2].kind = "강아지";
		animals[2].name = "체리";
		animals[2].age = 1;

		for (int i = 0; i < 3; i++) {
			System.out.println("--- animals[" + i + "] ---");
			animals[i].info();
		}
	}
}
