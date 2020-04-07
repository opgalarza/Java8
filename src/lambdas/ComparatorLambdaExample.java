package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		/*
		 * Legacy code
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Result of comparison: " + comparator.compare(3, 2));
		
		/*
		 * Functional code
		 */
		Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
		System.out.println("Result of functional comparison: " + comparatorLambda.compare(3, 2));
	}

}
