	package arraystopic;

public class OddEveFre {
   public static void main(String[] args) {
	   int[][] arr = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
	   int countEve=0;
	   int countOdd=0;
	   for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(arr[i][j]%2==0){
				countEve++;
			}else{
				countOdd++;
			}
		}
	}
	   System.out.println("frequency of even elements are-->"+countEve);
	   System.out.println("frequency of odd elements are-->"+countOdd);
}
}
