package comparable;

import java.util.Comparator;

public class ComparaNameAge implements Comparator<Royal>{

	@Override
	public int compare(Royal o1, Royal o2) {
     
        return o1.name.compareTo(o2.name);
	}

}
