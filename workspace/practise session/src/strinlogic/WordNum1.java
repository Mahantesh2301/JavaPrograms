package strinlogic;

import java.util.Scanner;

public class WordNum1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine().toLowerCase();    
		
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean flag = true;			
			for (int k = 0; k < i; k++) {
				if(str.charAt(i)==str.charAt(k)){
					flag = false;
					break;
				}
			}
			if(flag==true){
				for (int j = 0; j < str.length(); j++) {
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
				System.out.print(str.charAt(i)+""+count);
			}
		}
  }
}
