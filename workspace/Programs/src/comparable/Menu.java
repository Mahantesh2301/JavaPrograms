package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Menu implements Comparable{
	String item ;
	int price;
	Menu(String item , int price){
		this.item=item;
		this.price=price;
	}
	
	
@Override
	public String toString() {
		return "Menu [item=" + item + ", price=" + price + "]";
	}


public static void main(String[] args) {
	ArrayList<Menu> al = new ArrayList<Menu>();
	al.add(new Menu("roti" , 100));
	al.add(new Menu("idly" , 40));
	al.add(new Menu("masala dosa" , 100));
	al.add(new Menu("fried rice" , 100));
	al.add(new Menu("noodles" , 90));
	Collections.sort(al);
	for(Object e : al){
		System.out.println(e);
	}
}




@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Menu m=(Menu)o;
	return this.price-m.price;
}
}
