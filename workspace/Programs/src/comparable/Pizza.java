package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Pizza implements Comparable<Pizza>{
    int size;
    int price;
    Pizza(int size , int price){
    	this.size=size;
    	this.price=price;
    }
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Pizza o) {
	  if(this.size>o.size){
		  return -1;
	  }else{
		  return 1;
	  }
//     return this.price-o.price;
	}
    public static void main(String[] args) {
    	ArrayList<Pizza> al = new ArrayList<Pizza>();
    	al.add(new Pizza(100,10));
    	al.add(new Pizza( 150, 15));
    	al.add(new Pizza(200 , 20));
    	al.add(new Pizza(50 , 5));
    	Collections.sort(al);
    	Iterator it = al.iterator();
    	while(it.hasNext()){
    		System.out.println(it.next());
    	}
		
	}
    
}
