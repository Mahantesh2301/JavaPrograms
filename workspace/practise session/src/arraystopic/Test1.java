package arraystopic;

public class Test1 {
   public static void main(String[] args) {
	int [] arr = {50,7,9,10,13,8};
	int small = arr[0];
	int secsmall = arr[1];
	for (int i = 1; i < arr.length; i++) {
		if(small > arr[i]){
			secsmall = small ;
			small = arr[i];
		}else if(secsmall > arr[i]){
			secsmall = arr[i];
		}
	}
	System.out.println(secsmall);
}
}
