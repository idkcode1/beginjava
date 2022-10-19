//Write a Java program to find the numbers greater than the average of the numbers of a given array. 
import java.util.Arrays;

public class prg4{
	public static void main(String[] args) {
		int[] arr={1,2,5,6,9,48,55,77,99,11};
		int avg=0, sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("average = "+avg);
		for(int i=0;i<arr.length;i++){
			if(avg<arr[i]){
				System.out.println(arr[i]);
			}
		}
	}
}