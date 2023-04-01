package arraystopic;

import java.util.Arrays;
import java.util.Collections;

public class AscAndDes {
	public static void main(String[] args) {
	      String[] s= {"z","x","a","b","c"};
	  //asc order
	      Arrays.sort(s);
	      System.out.println("Asc order");
	      for(String s1:s)
	      System.out.println(s1);
	      
	      //dsc order
	      Arrays.sort(s,Collections.reverseOrder());
	      System.out.println("Desc order");
	      for(String s2:s)
	      {
	    	  
	    	  System.out.println(s2);
	      }
		}

}
