//move every positive number to the right and
//every negative number to the left of a given array of integers.
import java.util.Arrays;

public class prg5{
	public static void main(String[] args) {
		int[] arr={-1,2,3,5,4,6,-5,-4,-7,-8,0};
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}