package arraystopic;

public class Secmax {
  public static void main(String[] args) {
	
	  int [] arr = {1,2,4,5,1,6};
	  
	  int fstmax = 0;
	  int secmax = 0;
	  if(arr[0]>arr[1]){
		  fstmax = arr[0];
		  secmax = arr[1];
	  }else{
		  fstmax = arr[1];
		  secmax = arr[0];
	  }
	  for (int i = 2; i < arr.length; i++) {
		if(fstmax<arr[i]){
			secmax = fstmax;
			fstmax = arr[i];
		}
	}
	  System.out.println(secmax);
	  
}
}
