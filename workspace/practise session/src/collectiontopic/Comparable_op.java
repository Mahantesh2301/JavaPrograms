package collectiontopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparable_op  {
	String name;
	int age;

	Comparable_op(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public String toString() {
		return "name=" + name + ", age=" + age;
	}


//	public int compareTo(Comparable_op o) {
////    if(this.name.charAt(0)>o.name.charAt(0))
////    	return 1;
////    else
////    	return -1;
////		
//if(this.age>o.age)
//	return -1;
//else
//	return 1;
//    }
	
	
	
	public static void main(String[] args) {
		ArrayList<Comparable_op> emp = new ArrayList<>();
		emp.add(new Comparable_op("abz",24));
		emp.add(new Comparable_op("vikas",28));
		emp.add(new Comparable_op("abhi",18));
		emp.add(new Comparable_op("gagan",10));
		
		
		System.out.println(emp);
	}
}


class  Copmparator_op implements Comparator<Comparable_op>{

	@Override
	public int compare(Comparable_op o1, Comparable_op o2) {
	
		return o1.name.compareTo(o2.name);
	}
	
}





