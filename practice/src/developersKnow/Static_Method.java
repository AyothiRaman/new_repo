package developersKnow;

public class Static_Method {

	public static void main(String[] args) {
		
		hello();  // when we use static method we can call this way simply
		
		new Static_Method().hell(); // a non static method can be called this way
		
		

	}
	
	
	public static void hello() {
		System.out.println("this is static method");
	}
	
	
	public void hell() {
		System.out.println("this is normal method without static");
	}

}
