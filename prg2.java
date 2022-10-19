//Write a Java program to find the duplicate values of an array of integer values
import java.util.Arrays;
public class prg2{
	public static void main(String[] args) {
		int[] arr={1,2,2,5,6,8,48,7,7,7};
		int count=0,i=0,j=1;
		Arrays.sort(arr);
		//{1,2,2,5,6,8,7,7,7,48}

		for(i=0;i<10&&j!=10;i++){
			
			if(Integer.compare(arr[i],arr[j])==0){
				count=count+1;
				System.out.println(arr[i]);
				j++;
			}
			else{
				j++;
			}
		}
		System.out.println("duplicate count = "+count);
	}
}