package collectiontopic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapNameAge {

	public static void main(String[] args) {
		TreeMap<String, Integer> t1 = new TreeMap<String, Integer>();
		t1.put("sanjay", 29);
		t1.put("vikas", 25);
		t1.put("hemanth", 28);
		t1.put("rick", 30);
		t1.put("mahan", 24);
		t1.put("prajwal", 25);
		t1.put("sandesh", 28);
		t1.put("nagaaju", 40);
		// System.out.println(t1);
		for (Entry e : t1.entrySet()) {
			int age = (int) e.getValue();
			if (age % 2 == 0) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}

	}
}
