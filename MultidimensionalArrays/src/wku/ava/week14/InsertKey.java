package wku.ava.week14;
import java.util.Scanner;
public class InsertKey {
	  public static int binarySearch(int[] list, int key) {
		    int low = 0;
		    int high = list.length - 1;

		    while (high >= low) {
		      int mid = (low + high) / 2;
		      if (key < list[mid])
		        high = mid - 1;
		      else if (key == list[mid])
		        return mid;
		      else
		        low = mid + 1;
		    }
		    return -low - 1; // Now high < low
		  }

		  public static void main(String[] args) {
		    int[] list= {-3, 1, 2, 4, 9, 23};
		    //insert the key into the list, but notice the array is sorting in raising order
		    Scanner input = new Scanner(System.in);
		    int key = input.nextInt();
		    input.close();
		    int result = binarySearch(list, key);
		    if(result >= 0) {
		    	System.out.println("Is Found in " + result + " index position.");
		    }else {
		    	int[] list1 = new int[list.length + 1];
		    	System.arraycopy(list, 0, list1, 0, Math.abs(result) - 1);
		    	list1[Math.abs(result) - 1] = key;
		    	System.arraycopy(list,	Math.abs(result) - 1 , list1,Math.abs(result), list.length - Math.abs(result) + 1);
		    	System.out.println(java.util.Arrays.toString(list1));
		    }
		    
		    
}
}