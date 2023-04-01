package comparable;

import java.util.Comparator;

public class Compara implements Comparator<Laptop> {

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.price>o2.price && o1.ram>o2.ram){
			return 1;
		}else{
			return -1;
		}
	}
	


}
