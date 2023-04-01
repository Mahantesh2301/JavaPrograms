package collectiontopic;

import java.util.HashSet;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class Hasset {
  public static void main(String[] args) {
	HashSet h = new HashSet();
	h.add(10);
	h.add(70);
	h.add(40);
	h.add(50);
	int mul = 1;
	for (Object obj : h) {
		int val = (int)obj;
		mul = mul * val;
	}
	System.out.println(mul);
}
}
