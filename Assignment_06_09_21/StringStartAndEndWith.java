//3. Check if given string starts with A and End with t.

import java.util.Scanner;
public class StringStartAndEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter any string : ");
	     String s = sc.nextLine();
		if(s.startsWith("A") || s.startsWith("a") && s.endsWith("T") || s.endsWith("t"))
		{
			System.out.println("The String starts with A/a and ends with T/t");
		}
		else
		{
			System.out.println("The String dosent starts with A/a and end with T/t");
		}
	}
}
