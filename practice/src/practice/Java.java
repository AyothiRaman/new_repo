package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java {

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// Driver code
	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
		System.out.println("ArrayList with duplicates: " + list);

		// Construct a new list from the set constructed from elements
		// of the original list
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

		// Print the ArrayList with duplicates removed
		System.out.println("ArrayList with duplicates removed: " + newList);

		list.forEach((n) -> {
			System.out.println(n);
		});

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b;
		b = a[2] + a[3];
		a[0] = 1;
		System.out.println(b);

	}
}