package demo;

class multiply extends Thread {

 public void running(int x) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(x * i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	synchronized	public void run(int y) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(y * i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Sync {

	public static void main(String[] args) {

		multiply m = new multiply();

		Thread t1 = new Thread() {

			public void run() {
				m.run(5);

			}

		};

		Thread t2 = new Thread() {

			public void run() {
				m.running(6);
			}

		};

		t1.start();
		t2.start();
	}

}
