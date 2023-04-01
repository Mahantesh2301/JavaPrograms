package comparable;

import java.util.ArrayList;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList al3 = new ArrayList<>(); 
		
		System.out.println("enter 1st pu number of subjects");
		int end = sc.nextInt();
		
		System.out.println("enter 1st pu subjects");
		ArrayList al = new ArrayList();
	     while(end>0){
	    	 al.add(sc.next());
	    	 end--;
	     }
		
		al3.addAll(al);
		System.out.println("enter 2nd pu number of subjects");
		int end1 = sc.nextInt();
		System.out.println("enter 2nd pu subjects");
		ArrayList al2 = new ArrayList();
		 while(end1>0){
	    	 al2.add(sc.next());
	    	 end1--;
	     }
		
		al3.addAll(al2);
		if (al.size() == al2.size()) {
			System.out.println("number of subjects are same");
		} else {
			System.out.println("number of subjects are not same");
		}

		System.out.println("total number of subjects studied by student is " + (al.size()+al2.size()));
		System.out.println();

		System.out.println(al3);

	}
}
