package day22;

import java.util.Scanner;

// User 클래스로 만들어진 다음 객체를 묶어서 관리할 객체 배열 users 생성

class User {
	String name;
	String phone;
	int age;
	String gender;

	void info() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
	}
}

public class UserArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		User users[] = new User[3];

		for (int i = 0; i < 3; i++) {
			users[i] = new User();
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("name: ");
			users[i].name = sc.next();
			System.out.print("phone: ");
			users[i].phone = sc.next();
			System.out.print("age: ");
			users[i].age = sc.nextInt();
			System.out.print("gender: ");
			users[i].gender = sc.next();
		}

		for (int i = 0; i < 3; i++) {
			users[i].info();
		}
	}
}
