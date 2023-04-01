package arraystopic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainDup {
	public static void main(String[] args) {
	    String[] duplicate=new String[] {"java","web","c","java"};
	    List dupliList=Arrays.asList(duplicate);
	    Set dupliSet=new HashSet<>(dupliList);
	    if(dupliList.size()!=dupliSet.size())
	    {
	    	System.out.println("The Array Contains Duplicates");
	    }
	    else
	    {
	    	System.out.println("The array doesn't contains duplicates");
	    }
	    		
		}
}
