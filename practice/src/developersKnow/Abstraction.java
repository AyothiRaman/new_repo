package developersKnow;

import java.util.ArrayList;


import java.util.Iterator;



abstract class Animal{
	abstract void lion();
	abstract void hwh();
	
	


public void sleep() {
	System.out.println("the lion is sleeping");
}

static void hh() {
	System.out.println();
}
}

class Mani extends Animal{

	@Override
	void lion() {

		
	}

	@Override
	void hwh() {
		// TODO Auto-generated method stub
		
	}
	
}






class Tiger extends Animal{

	@Override
	void lion() {

		System.out.println("the lion is poweful animal in forest");
	}
	
}


public class Abstraction {

	
	public static void main(String[] args) {
		
		Animal animal = new Animal() {
			
			@Override
			void lion() {
				// TODO Auto-generated method stub
				
			}
		};
		
		animal.sleep();
//		Tiger tiger = new Tiger();
//		//tiger.lion();
//		tiger.sleep();
		
		listExample();
		
		
	
	}
	
	
	public static void exception() throws RuntimeException, InterruptedException {
		
		Thread t = new Thread(); // use state
		t.start(); // runnable state
		t.wait();  // waiting state
		t.stop(); // terminated
		
		
		
		
		
		
		try {
			
			int x[] = new int[4];
			
			x[0] =7;
			x[5]=10;
		}catch (ArrayIndexOutOfBoundsException e ) {
			
			System.out.println(e);
		}
		
		
	}
	
	
	static void listExample() {
		
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		
		
		// step 1
		
		System.out.println(list+"step 1");
		
		// step 2
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + "step 2");
			
		}
		
		System.out.println();
		// for each loop step 3
		
		for(int x :list) {
			System.out.println(x +"step 3");
		}
		
		//step 4
		
		System.out.println();
		for(int i=0;i<list.size();i++) {
			int x = list.get(i);
			System.out.println(x+"step 4");
		}
		
	}
}
