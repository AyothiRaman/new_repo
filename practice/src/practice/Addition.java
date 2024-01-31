package practice;







interface M1{
	default void print() {
		System.out.println("m1");
	}
		
}

interface M2{
	default void print() {
	System.out.println("m2");
}

class Moring implements M1,M2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		M2.super.print();
	}

	


	
}


class Add{
	
	
	 public void x(int a) {
		int a1= a;
	 }
	 public void y(int b) {
		 int b1= b;
		// int z=a1+b1;
	 }
	 
	
	
	

//
//	public void h() {
//		
//		int z =x+y;
//		System.out.println(z);
//	}
	
}

public class Addition {

	
	public static void main(String[] args) {
		
		Add a = new Add();
      a.x(2);
		
		
	}

}
