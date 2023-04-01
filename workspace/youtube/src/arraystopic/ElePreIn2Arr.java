package arraystopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElePreIn2Arr {
	public static void main(String[] args) {
		// Java Program to check whether an element is present in two arrays in
		// given 3 arrays

		Integer[] a = { 1, 2, 3, 8, 7 };
		Integer[] b = { 4, 1, 2, 10, 15 };
		Integer[] c = { 5, 1, 2, 4, 10 };
		// first print all unique values of 3 arrays.
		HashSet<Integer> h = new HashSet<>();
		// convert in to List (next easy to convert HashSet).
		List<Integer> l1 = Arrays.asList(a);
		List<Integer> l2 = Arrays.asList(b);
		List<Integer> l3 = Arrays.asList(c);

		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);

		ArrayList<Integer> al = new ArrayList<>();
		for (Integer n : h) {
			if ((l1.contains(n) && l2.contains(n)) || (l2.contains(n) && l3.contains(n))
					|| (l3.contains(n) && l1.contains(n))) {
				al.add(n);
			}
		}
		System.out.println(al);
	}

}
