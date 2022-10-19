//Write a Java program to find the kth smallest and largest element in a given array.
import java.util.Arrays;
import java.util.Scanner;
public class prg3{
	public static void main(String[] args) {
		int[] arr={78,5,2,9,66,84,3,79,15}; // Elements in the array can be in any order.
		int k;
		System.out.println("enter the kth element to search");
		Scanner n= new Scanner(System.in);
		k = n.nextInt();
		Arrays.sort(arr);
		//2,3,5,9,15,66,78,79,84

		System.out.println("highest number ="+arr[k-1]);
		System.out.println("smallest number="+arr[arr.length-k]);
	}
}