package strinlogic;

public class WordNum2 {
   public static void main(String[] args) {
	 String str = "hello";
	 String s = "";
	 
	 for (int i = 0; i < str.length(); i++) {
		
		 char ch = str.charAt(i);
		 if(s.indexOf(ch)==-1){
			 int count=1;
			 for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)){
					count++;
					s+=ch;
				}
			}
			 System.out.print(ch+""+count+" ");
		 }
	}
}
}
