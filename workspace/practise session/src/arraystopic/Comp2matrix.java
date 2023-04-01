package arraystopic;

public class Comp2matrix {
    public static void main(String[] args) {
    	int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
    	int[][] brr={{10,20,30},{40,50,60},{70,80,90}};
    	
    	boolean flag = true;
    	for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				if(arr[i][j]!=brr[i][j]){
					flag = false;
					break;
				}
			}
		}
    	if(flag){
    		System.out.println("two matrix are identical");
    	}else{
    		System.out.println("two matrix are non-identical");
    	}
	}
}
