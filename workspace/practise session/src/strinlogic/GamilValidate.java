package strinlogic;
import java.util.Scanner;
public class GamilValidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter mail id check");
			String str = sc.nextLine();
			if (str.contains("@") && (str.contains(" "))==false) {
				String[] str1 = str.split("@");
				if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
					int dot1 = str.length() - 4;
					int dot2 = str.length() - 3;
					int spc = str.length() - 5;
					int spc1 = str.length() - 4;
					int dot = 0;
					int at = 0;
					for (int i = 0; i < str.length(); i++) {
						if (str.charAt(i) == '.')
							dot++;
						else if (str.charAt(i) == '@') {
							at++;
						}
					}
					try{
					if (str.charAt(spc) != '@' && str.charAt(spc1) != '@' && str.charAt(str.length() - 1) != '@') {
						if (at == 1 && dot == 1 && str.charAt(str.length() - 1) != '.') {
							if (str.charAt(dot1) == '.' || str.charAt(dot2) == '.') {
								System.out.println("valid mail");
							} else {
								System.out.println("not a valid mail");
							}
						} else {
							System.out.println("not a valid mail");
						}
					} else {
						System.out.println("not a valid mail");
					}
				}
					catch(Exception e){
					System.out.println("not a valid mail");
				}
				} else {
					System.out.println("not a valid mail");
				}

			} else {
				System.out.println("not a valid mail");
			}
			System.out.println();
		}

	}
}
