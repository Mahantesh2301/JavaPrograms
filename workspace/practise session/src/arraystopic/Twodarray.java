package arraystopic;

import java.util.Arrays;
import java.util.Scanner;

public class Twodarray {
        public static void main(String[] args) {
        	Scanner sc= new Scanner(System.in);
			char [][] arr = new char[3][4];
		   for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		   for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}
        
}
