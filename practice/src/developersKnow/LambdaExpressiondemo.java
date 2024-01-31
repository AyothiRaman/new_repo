package developersKnow;

interface Tiger1 {

	void hello();

}

interface Multiple {
	Integer cal(int c, int g);

}

class Deer implements Tiger1 {

	@Override
	public void hello() {
		
		
		// TODO Auto-generated method stub

	}

}

class Lion implements Tiger1 {

	@Override
	public void hello() {
		// TODO Auto-generated method stub

	}

}

public class LambdaExpressiondemo {
	static void method(Tiger1 tiger1) {

		tiger1.hello();

	}
	
	
	static Integer method1(Multiple mul){
		return mul.cal(12, 034);
		
	}

	
	
	public static void main(String[] args) {
		
		
		int m1 =10;
		double m2=90.0;
		double c1 = m1+m2;
		
		

		String str = "deepan";

		Multiple o = (c, g) -> c * g;
		System.out.println(method1(o));

		int j = 7;
		int k = 90;
		//System.out.println(o.cal(j, k));
		
		
		
//	Tiger1 tiger= ()-> {
//		System.out.println("this is lAMBDA ");
//		
//		
//	};

		method(() -> {
			System.out.println("jjjj");

		});

	}

}
