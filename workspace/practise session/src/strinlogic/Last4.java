package strinlogic;

import java.util.Scanner;

public class Last4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a city");
    String str = sc.nextLine();
    System.out.println(str.substring(str.length()-4));
    
}
}
