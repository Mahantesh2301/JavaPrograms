package arraystopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	//3 Different ways to convert arrays to Arraylist in java?
		public static void main(String[] args) {
			String[] s= {"Red","Yellow","Blue"};
			List<String> l=Arrays.asList(s);
			System.out.println(l);
			//2nd way
			List<String> l1=new ArrayList<>();
			Collections.addAll(l1,s);
			System.out.println(l1);

			//3rd way
			for(String s1:s)
			{
				l1.add(s1);
			}
			System.out.println(l1);
			
		}

}
