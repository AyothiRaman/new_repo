package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		// Write your code here.

		List<Integer> seq = new ArrayList<>();
		seq.addAll(sequence);

		List<Integer> arr = new ArrayList<>();
		arr.addAll(array);

		List<Integer> eq = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < seq.size(); j++) {

				if (arr.contains(seq.get(j))) {
					// System.out.println("Exist : "+seq.get(j));
					eq.add(seq.get(j));

				} else {
					// System.out.println("not Exist"+seq.get(j));
				}
				

			}
		break;

		}
		System.out.println(eq);
		
	
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer []arr= {1,2,3,4,5,6,7};
		List<Integer> array1 = new ArrayList<>();
//		Iterator<array> it=new Iterator<array>();
		array1.add(10);
		array1.add(60);
		array1.add(30);
		
		
		List<Integer> sequence1 = new ArrayList<Integer>();
		sequence1.add(10);
		sequence1.add(20);
		sequence1.add(30);

		Collection.isValidSubsequence(array1, sequence1);

	}

}
