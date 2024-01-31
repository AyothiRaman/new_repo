package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionExampleDemo {
	
	
	public static void collectionListMethod(List<Integer> array1,List<Integer> array2 ) {
		
		
		for(int i=0;i<array1.size();i++) {
			System.out.println(array1);
		}
		array1.forEach(null);
	}
	public static void main(String[] args) {
		
		
		ArrayList<Integer> m1 = new ArrayList<>();
		m1.add(1);
		m1.add(2);
		m1.add(3);
		
		ArrayList<Integer> m2 = new ArrayList<>();
		m2.add(4);
		m2.add(5);
		m2.add(8);
		
		CollectionExampleDemo.collectionListMethod(m1, m2);
		
	}

}
