package arraystopic;

import java.util.Arrays;

public class CopyOfArr {
	public static void main(String[] args) {
	    //How to copy arrays using Arrays.copyOf() method in java?
			int [] a= {10,20,30,40};
			int [] b= Arrays.copyOf(a, a.length);
			
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}

}
