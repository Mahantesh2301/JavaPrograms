package arraystopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevArrCol {

	public static void main(String[] args) {
		// How to reverse the order of elements in arraylist in java?
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Before Reversing " + list);
		Collections.reverse(list);
		System.out.println("After Reversing " + list);
	}
}
