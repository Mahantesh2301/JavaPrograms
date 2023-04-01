package arraystopic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Element repeated for length/2 of an array 
public class MajorityEle {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 2, 3, 3, 3, 3, 3 };
		Map<Integer, Integer> s = new HashMap<>();
		for (Integer n : a) {
			if (s.containsKey(n) == false) {
				s.put(n, 1);
			} else {
				int val = (int) s.get(n);
				int newvl = val + 1;
				s.put(n, newvl);
			}
		}
		int lim = a.length / 2;
		for (Entry e : s.entrySet()) {
			int val = (int) e.getValue();
			if (val >= lim)
				System.out.println("Majority element is " + e.getKey());
		}

	}
}
