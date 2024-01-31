package trainingDemo;

abstract class Member {
	String name = "hello";

	abstract void welcomeMessage();

	void name() {
		System.out.println("hello");
	}
}

class Student extends Member {

	@Override
	void welcomeMessage() {
		System.out.println("welcome student" + " " + name);

	}

}

class Teacher extends Member {

	@Override
	void welcomeMessage() {
		System.out.println("welcome teacher");

	}

}

public class College {

	public static void main(String[] args) {

		Student s = new Student();
		s.welcomeMessage();
		s.name();

		Teacher t = new Teacher();
		t.welcomeMessage();

	}

}