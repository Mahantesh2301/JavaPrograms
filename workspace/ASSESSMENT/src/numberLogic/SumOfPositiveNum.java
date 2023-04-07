package numberLogic;

import java.util.Scanner;

public class SumOfPositiveNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter start and end number");
	int s = sc.nextInt();
	int e =sc.nextInt();
	int sum = 0;
	if(s>=0 && e>=0)
	for (int i = s; i <=e; i++) {
		sum = sum+i;
	}
	System.out.println(sum);
}
}
