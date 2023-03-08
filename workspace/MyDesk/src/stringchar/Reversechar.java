package stringchar;

import java.util.Arrays;

public class Reversechar {
public static void main(String[] args) {
	String str="kali quatru bottly hange lifuu";
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}
	System.out.println();
	
    char[] ch = str.toCharArray();
    System.out.println(Arrays.toString(ch));
    
    
}
}
