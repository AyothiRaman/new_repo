package practice;

interface I1 {
	default void print() {
		System.out.println("dll");
	}
}

interface I2 {
	default void print() {
		System.out.println("I1");
	}

	static public void hell() {
		System.out.println("kkkk");

	}
}

public class Hello implements I1, I2 {

	public static void main(String[] args) {

		Hello h = new Hello();
		h.h();
		int x = +10;
		System.out.println(x);

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		I1.super.print();
	}

	void h() {
		I2.super.print();

	}

}
