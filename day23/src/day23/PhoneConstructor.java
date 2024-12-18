package day23;

class Iphone {
	String model;
	String color;
	int capacity;

	Iphone() {
	}

	Iphone(String model, String color, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}

	void info() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("capacity: " + capacity);
	}
}

public class PhoneConstructor {
	public static void main(String[] args) {
		Iphone myPhone1 = new Iphone();
		Iphone myPhone2 = new Iphone("iphone SE", "white", 70);
		System.out.println(myPhone1.capacity);
		System.out.println(myPhone2.capacity);
	}
}
