package arraystopic;

import java.util.HashSet;

public class CommonEleIn2Arry {
		public static void main(String[] args) {
	    int a[]= {10,20,30,40,50};
	    int b[]= {60,50,80,10,90};
	    common(a,b);
		}
		public static void common(int[] a,int[] b)
		{
			HashSet<Integer> hs=new HashSet<>();
			for(int i=0;i<a.length;i++)
			{
				hs.add(a[i]);
			}
			for(int i=0;i<b.length;i++)
			{
				if(hs.contains(b[i]))
				{
					System.out.println(b[i]);
				}
			}
		}
}
