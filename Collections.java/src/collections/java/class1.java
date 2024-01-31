package collections.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class1 {

	public static void main(String[] args) {

//====================================================================

		List<String> Str = Arrays.asList("sara", "khan", "xyz", "mnmm");

		System.out.println("name Starts with");

		Stream<String> st = Str.stream().filter(sn -> sn.startsWith("s"));
		st.forEach(System.out::println);

		System.out.println("uppercase");

		Stream<String> lit = Str.stream().map(String::toUpperCase);
		lit.forEach(System.out::println);
		

		Stream<String> l = Str.stream().filter(str -> str.length() > 2);
		l.forEach(System.out::println);

//================================================================

		List<Integer> numbers = Arrays.asList(4, 2, 8, 9, 5, 6, 7, 8);

		Stream<Integer> num = numbers.stream().filter(i -> i > 5);
		num.forEach(System.out::println); 
		

		System.out.println("after");
		Stream<Integer> ss = numbers.stream().distinct();
		ss.forEach(System.out::println);

		List<Integer> s = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(s);

		System.out.println("using collections");
		Collections.sort(numbers);

		for (Integer sn : numbers) {
			System.out.println(sn);
		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(110, "Ravi");
		hm.put(120, "Prateek");
		hm.put(130, "Davesh");
		hm.put(140, "Kamal");
		hm.put(150, "Pawan");

// object.values
//object.entryset
//object.keyset

		Stream<String> kk = hm.values().stream().filter(snn -> snn.endsWith("n"));
		kk.forEach(System.out::println);

//Stream<Integer> ll = hm.keySet().stream().filter(nn->nn.equals(numbers);

//
		long uu = hm.entrySet().stream().count();
		System.out.println(uu);

		HashSet hs = new HashSet<>();
		hs.add(66);

	}

}