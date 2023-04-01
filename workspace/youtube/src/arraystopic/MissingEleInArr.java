package arraystopic;

import java.util.HashSet;

public class MissingEleInArr {
	public static void main(String[] args) {
		Integer[] a = { 1, 9, 6 };
		missing(a);
	}

	public static void missing(Integer[] a) {

		HashSet<Integer> h = new HashSet<Integer>();

		for (int n : a) {
			h.add(n);
		}
		int num = a.length + 1;
		for (int i = 0; i < num; i++) {
			if (!h.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
