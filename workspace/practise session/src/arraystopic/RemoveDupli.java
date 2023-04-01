package arraystopic;

import java.util.Arrays;

public class RemoveDupli {
  public static void main(String[] args) {
  int [] arr = {1,2,3,4,2,5,1,3,1,5,85,45,85,55,55};
    
  for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]==arr[j]){
			arr[i]=-1;
		}
	}
}
  for (int i = 0; i < arr.length; i++) {
	
		if(arr[i]!=-1){
			System.out.print(arr[i]+" ");
		}
	}
}
}

