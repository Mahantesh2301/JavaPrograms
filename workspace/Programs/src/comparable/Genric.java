package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Genric {
  public static void main(String[] args) {
	ArrayList a1 = new ArrayList<>();
	a1.add(10);
	a1.add(90);
	a1.add(20);
	a1.add(50);
	a1.add(30);
	Collections.sort(a1);
	System.out.println(a1);
}
}
