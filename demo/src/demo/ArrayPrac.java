package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPrac {

	public static void main(String[] args) {
		
		char String='L';
		int Float=3;
		System.out.print(Float);
		System.out.print(String);

		Integer a[] = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		// {0,0,0,0,0,1,1,1,1,1}

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					System.out.println(a[i]);
				} else {
					System.out.println(a[j]);
				}
			}
		}

	}

}
