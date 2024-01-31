package demo;

class Ditto extends Thread {

	public void hint() {
		

		try {
			System.out.println("inside try block");

			// Throw an Arithmetic exception
			System.out.println(34 / 0);
		}

		// catch an Arithmetic exception
		catch (ArithmeticException e) {

			System.out.println("catch : exception handled.");
		}

		// Always execute
		finally {

			System.out.println("finally : i execute always.");
		}
	}

}

public class Exception{

	public static void main(String[] args) {
		Ditto d = new Ditto();
		d.start();
		d.hint();

	}

}
