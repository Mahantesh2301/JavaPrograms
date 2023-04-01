package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Royal implements Comparable<Royal>{
  String name;
  int age;
  int id;
public Royal(String name, int age, int id) {
	super();
	this.name = name;
	this.age = age;
	this.id = id;
}
@Override
public String toString() {
	return "Royal [name=" + name + ", age=" + age + ", id=" + id + "]";
}
  public static void main(String[] args) {
	  ArrayList<Royal> al = new ArrayList<Royal>();
	  al.add(new Royal("mahan",23,101));
	  al.add(new Royal("abhi",20,102));
	  al.add(new Royal("abhi",22,103));
	  al.add(new Royal("abhi",25,104));
	  al.add(new Royal("viswa",21,105));
	  
	 Collections.sort(al); 
	  for(Object e : al){
		  System.out.println(e);
	  }
}
@Override
public int compareTo(Royal o) {
	if(this.age>o.age){
		this.name.compareTo(o.name);
		return -1;
	}else{
		return 1;
	}
}

}
