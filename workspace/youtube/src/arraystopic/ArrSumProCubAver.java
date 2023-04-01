package arraystopic;

public class ArrSumProCubAver {
public static void main(String[] args) {
	int [] arr = {1,2,5,4,3};
	int prod =1;
	int sum =0;
	for (int i = 0; i < arr.length; i++) {
		sum = sum +arr[i];
		prod =prod*arr[i];
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println("cube of "+arr[i]+" "+arr[i]*arr[i]*arr[i]);
	}
	double avr = sum/arr.length;
	System.out.println("product of array "+prod);
	System.out.println("average of array "+avr);
}
}
