package collectiontopic;

import java.util.LinkedHashSet;

public class SetNameAge {
	String name;
	int age;
	SetNameAge (String name , int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return this.name +" "+this.age;
	}
 public static void main(String[] args) {
	 
	 SetNameAge s1 = new SetNameAge("mahan",24);
	 SetNameAge s2 = new SetNameAge("vikas",25);
	 SetNameAge s3 = new SetNameAge("hemanth",26);
	 
	LinkedHashSet l = new LinkedHashSet();
	l.add(s2);
	l.add(s2);
	l.add(s3);
	
	System.out.println(l);

	
}
}
