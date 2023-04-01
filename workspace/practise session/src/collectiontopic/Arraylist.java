package collectiontopic;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();

		a1.add("vikas");
		a1.add("hemanth");
		a1.add("mahan");
		a1.add("rick");
		a1.add("nagaraju");
		System.out.println(a1);
		
	Iterator i = a1.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}

		ArrayList a2 = new ArrayList();

		a2.add("vikas");
		a2.add("hemanth");
		a2.add("mahan");
		a2.add("rick");
		a2.add("nagaraju");
            a2.addAll(a1);
	}
}
