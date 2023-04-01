package arraystopic;

public class BinarySearch {
	public static void main(String[] args) {
	      int[] a= {10,20,30,40,50};
	      int key=50;
	      int index=binarySearch(a,0,a.length-1,key);
	      System.out.println("Element found at index "+index);
		}

		private static int binarySearch(int[] a, int low, int high, int key) {
			if(high>=low)
			{
				int mid=low+((high-low)/2);
				if(a[mid]==key)
					return mid;
				if(key>a[mid])
				{
					return binarySearch(a,mid+1,high,key);
				}
				if(key<a[mid])
				{
					return binarySearch(a,mid-1,low,key);
				}
			}
			return -1;
		}
}
