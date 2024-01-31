package practice;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	 int x=50;
	 
	
	 public  Animal() {
		
		
		
		System.out.println("kkkk-------");
	}
	public void animalSound() {
		System.out.println(this.x);
		
		System.out.println("it makes sound");
	}

}

class Dog extends Animal{

	public int y=80;
	
	
	Dog(){
		super();
	}
	public void animalSound() {
		
		
		
		System.out.println("kkkkkkkkkkkkkkkkk");
	//	this.animalSound();
		super.animalSound();
		System.out.println("dog makes sound");
	}
}

class Cat extends Dog{
	public void sound() {
		super.animalSound();
		
		
	}
}

public class SuperKeywordDemo {

	  public static void  main(String[] args) {
		
		Dog ani = new Dog();
		System.out.println();
		ani.animalSound();
		
		varArgs(1,2,3,4,5,5);
		varArgs(1,2,3,4,5,5);
		
		ArrayList<Object> gg = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();

		gg.add(1);
        gg.add("000");
        
       System.out.println(gg);
				

	}
	  
	  
	  static void varArgs(int... numbers) {
		  for(int num :numbers) {
			  System.out.println("num"+num);
			  
			  
		  }
	  }

}
