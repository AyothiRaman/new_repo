package developersKnow;

import java.util.function.Predicate;

public class StringDemo {

	public static void main(String[] args) {
		
		StringDemo d = new StringDemo();
		d.equals();
		System.out.println(   d.ifs());
		
		Predicate<Integer> a =b->(b>18);
			System.out.println(a.test(18));
		

	}
	
	private boolean equals() {
		

		var brand ="Ayothi";  // this is one memory
		var brand3 ="Ayothi";
		String brand2 = new String("Ayothi"); // this is another memory
		System.out.println(brand == brand3);
		return brand == brand2;
		
		
		
	}
	// another example using boolean
	
	private boolean ifs() {
		
		var bool = "a".equals("A");
		
		// if(bool == true) -> don't use this type
		
		if(bool) {
			return true;
		}
		
		if(!bool) {
			return false;
		}
		
		return false;
	}

}
// never use double equals for compare String because it compare memory and location