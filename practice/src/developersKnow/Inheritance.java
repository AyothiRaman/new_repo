package developersKnow;


class Pig{
	void eat() {
		System.out.println("this is animal Method");
	}
}

class Bird extends Pig{
	void  fly() {
		System.out.println("this is bird");
	}
}

class Cow extends Bird{
	void sleep() {
		System.out.println("this is cow method");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Cow c = new Cow();
		c.eat();
		c.fly();
		c.sleep();
		

	}

}
