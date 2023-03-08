package converting;

public class Givenstring {
    public static void main(String[] args) {
		String str="hello";
		for(int i = 0; i<str.length();i++)
		{
			//char ch = str.charAt(i);
			int no = (int)str.charAt(i)+4;
			char ch = (char)no;
			System.out.print(ch);
		}
	}
}
