package strinlogic;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	  
	String str  = "hello java hello mava";
	String str1[] = str.split(" ");
	System.out.println(Arrays.toString(str1));
	
	for (int i = 0; i < str1.length; i++) {
		System.out.println(str1[i]);
	}
	
}
}
