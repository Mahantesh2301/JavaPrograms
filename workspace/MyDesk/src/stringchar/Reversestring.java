package stringchar;

import java.util.Arrays;

public class Reversestring {
public static void main(String[] args) {
	String str = "hoga beda hudugi nanna bittu";
	
	String[] str1 = str.split(" ");
	
	System.out.println(Arrays.toString(str1));     
	char[] str2 = str.toCharArray();
	System.out.println(Arrays.toString(str2));
	String[] str3 = str.split("");
	System.out.println(Arrays.toString(str3));
	
//        for (int i = str1.length-1; i>=0; i--)
//        {
//        	
//        	if(i==0)
//        	{
//        		System.out.print(str1[i]);
//        	}
//        	else
//        	{
//        		System.out.print(str1[i]+" ");
//        	}
//        }
        for(int i = str3.length-1; i>=0; i--)
        {
        	System.out.print(str3[i]);
        }
}
}
