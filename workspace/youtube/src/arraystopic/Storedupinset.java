package arraystopic;

import java.util.HashSet;
import java.util.Set;

public class Storedupinset {
    public static void main(String[] args) {
		Integer [] arr ={1,2,5,1,2,6,3,6};
		Set dup = new HashSet(); 
		Set org = new HashSet();
		
		for (Integer n : arr) {
			if(org.contains(n)==false){
				org.add(n);
			}else{
				dup.add(n);
			}
		}
		System.out.println(dup);
	}
}
