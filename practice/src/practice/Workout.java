package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Workout {

	public static void main(String[] args) {
		
		Workout w = new Workout();
		w.secondSmallestElement();
		w.matchingValues();
		
		w.reverseArray();
		w.getIntersectionValues();
		w.system();
		reverse();

	}
	
	public void secondSmallestElement() {
		
		int b[]=new int[5];
		b[0]=1;
		b[1]=1;
		b[2]=3;
		b[3]=4;
		b[4]=5;
		
		// note : for example here duplicate values are present it will get now 1 as output 
		// but we want to as output 3 so at the situation we use distinct method to get only unique values
	
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		
		int smallestElement = Arrays.stream(b).distinct().sorted().skip(1).findFirst()
				.orElseThrow(()-> new IllegalArgumentException("Array does not have any second smallest value exception"));
		
		System.out.println("The second smallest array in the given elemsnt is : "+smallestElement);
	}
	
	
	
	
	public void matchingValues() {
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {3,4,5,6};
		
	List<Integer> commonVlaues =	Arrays.stream(array1).filter(num->Arrays.stream(array2).
				anyMatch(arr2Num->arr2Num==num)).boxed().collect(Collectors.toList());
	
	System.out.println("The common values are "+ commonVlaues);
	}
	
	
	public void reverseArray() {
		int arr[]= new int[] {5,4,3,2,1};
		
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]);
			
		}
	}
	
	
	public void getIntersectionValues() {
		int a[] = {1,2,2,3};
		int b[] = {2,6,7,8};
		
		
List<Integer> value = Arrays.stream(a).filter(x-> Arrays.stream(b).anyMatch(y->y==x)).distinct().boxed().collect(Collectors.toList());

System.out.println(value);
	
	}
	
	public void system() {
		System.out.println(1+2+3+"welcome"+4+5+5+9+8);
	}
	
	
	public static void reverse() {
		String s="AYOTHI";
		String m = "";
		for(int i=0;i<s.length();i++) {
			m=s.charAt(i)+m;
					
		}
		System.out.println(m);
	}
	
	

}
