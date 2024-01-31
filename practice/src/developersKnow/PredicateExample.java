package developersKnow;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		//exampleForPredicate();
		predicateJoiningExample();
		functionExamxple();
	
		
		
		
		Predicate<Integer> predicate = PredicateExample::predicate;
		
		//System.out.println(predicate.test(50));
		
		

	}

	public static void exampleForPredicate() {

		Predicate<Integer> peridicate = num -> (num > 10);

		//System.out.println(peridicate.test(20));
		
		

	}

	static boolean predicate(int num) {

		if (num > 20) {
			return true;
		} else
			return false;
	}
	
	
	static void predicateJoiningExample() {
		
		
		Predicate<Integer> predicate1 = h->(h>20);
		
		Predicate<Integer> predicate2 = h1->(h1>50);
		
		System.out.println(predicate1.and(predicate2).test(100));
		System.out.println(predicate1.negate().test(10));

	}
	
	// Example for function
	
	static void functionExamxple() {
		
		Function<Integer, Integer> function = o->o*o;
		
		//System.out.println(function.apply(8));
		
		//functional chaining
		
		Function<Integer, Integer> func = o->o*o;
		
		func.apply(1);
		
		Function<Integer, Integer> func2 = o->o*o;
		func2.apply(10);
		
		System.out.println(func.andThen(func2).apply(10));
		
		
		
	}
	
	
	

}
