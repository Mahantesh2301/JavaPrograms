package strinlogic;

public class StringMethods {
  public static void main(String[] args) {
  String str = "Hello Mahan";
  
    System.out.println(str.length());
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
    System.out.println(str.concat(" how are you"));
    System.out.println(str.charAt(5));
    System.out.println(str.indexOf('l'));
    System.out.println(str.startsWith("M"));
    System.out.println(str.endsWith("an"));
    System.out.println(str.contains("a"));
    System.out.println(str.substring(3));
    System.out.println(str.substring(2,4));
}
}
