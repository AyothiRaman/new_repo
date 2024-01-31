package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Anim {

	default void j() {
		System.out.println("kkk");
	}

	static int multi(int a, int b) {
		return a + b;
	}

	void king();

	static void hello() {
		System.out.println("this is hello method");
	}
	static void hllo() {
		System.out.println("this is hello method");
	}
}

class Boss{
	public static int mul(int a, int b) {
		return a + b;
	}
	

	

}

public class InterfaceWithMethodReference {

	public static void main(String[] args) {

		Anim nn = Anim::hello;
		nn.king();

		Anim an = () -> {
			System.out.println("thi sis ");
		};

		an.king();

		int result = Anim.multi(0, 0);

		Boss k = new Boss();
		k.j();

	}

}
