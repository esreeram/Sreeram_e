package Sreeram_e;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year You want to check");
		int n = sc.nextInt();
		if(n%4 == 0 || n%100 != 0)
		{
			if(n%100 != 0 || n%400 ==0) 
			{
			 System.out.println("Year You have entered is a leap year");
			}
			else
			{
				System.out.println("Year that you have entered is not a leap year");
			}
		}
		
	}

}
