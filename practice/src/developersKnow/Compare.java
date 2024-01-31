package developersKnow;

class ArrayCompare {

	int[] a = { 3, 6, 7, 100, 12, 22, 12, 12 };

	int[] b = { 12, 3, 6, 100, 40, 3, 50, 7 };

	static int v;

	void compareNew() {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					// v = a[i];
					break;
					// System.out.println(v);
				} else {

					if (v > a[i]) {
						v = a[i];
					} else
						v = a[i];

				}
			}
		}
		System.out.println(v);
	}
}

public class Compare {

	public static void main(String[] args) {

		ArrayCompare com = new ArrayCompare();
		com.compareNew();
		
		

	}

}
