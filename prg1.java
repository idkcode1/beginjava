//Write a Java program to convert minutes into a number of years and days 
// 1 day = 1440 mins
// 1year = 365 days = 525600 mins
import java.util.Scanner;

public class prg1{
	public static void main(String[] args) {
		float day=0, year=0;
		System.out.println("Enter minutes");
		Scanner a= new Scanner(System.in);
		float min= a.nextInt();
		day = min/1440;
		year = min/525600;
		System.out.println("day="+day);
		System.out.println("\tyear="+year);
	}	

}