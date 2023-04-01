package comparable;

import java.util.Comparator;

public class Compa2 implements Comparator<Royal>{

	@Override
	public int compare(Royal o1, Royal o2) {
		  return o1.name.compareTo(o2.name);
	}

}
