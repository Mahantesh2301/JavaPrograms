package arraystopic;

public class Secmin {
  public static void main(String[] args) {
	  int fstmin =0;
	  int secmin =0;
	  int [] arr ={1,5,6,4,2,8,6};
	  if(arr[0]<arr[1])
	  {
		  fstmin=arr[0];
		  secmin=arr[1];
	  }else{
		  fstmin=arr[1];
		  secmin=arr[0];
	  }
	 
	  
	  for (int i = 2; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]<arr[j]){
				secmin = fstmin;
				fstmin=arr[i];
				
			}
		}
	}
	  System.out.println(secmin);
}
}
