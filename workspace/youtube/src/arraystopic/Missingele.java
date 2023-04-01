package arraystopic;

public class Missingele {
public static void main(String[] args) {
	int [ ]arr = {1,2,3,4,5,7};
	int n = arr[arr.length-1];
	int actualsum = n*(n+1)/2;
	int arrsum = 0;
	
	for (int i = 0; i < arr.length; i++) {
		arrsum=arrsum+arr[i];
	}
	System.out.println((actualsum)-(arrsum));
}
}
