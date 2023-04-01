package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Laptop  {
  int price;
  int ram;
public Laptop(int price, int ram) {
	this.price = price;
	this.ram = ram;
}
@Override
public String toString() {
	return "Laptop [price=" + price + ", ram=" + ram + "]";
}

public static void main(String[] args) {
	ArrayList<Laptop> al = new ArrayList<Laptop>();
	al.add(new Laptop(10000,16));
	al.add(new Laptop( 20000, 8));
	al.add(new Laptop(5000, 32));
	al.add(new Laptop(2500 , 64)); 
	Collections.sort(al , new Compara());
	for(Object e : al){
		System.out.println(e);
	}
}


   
  
}
