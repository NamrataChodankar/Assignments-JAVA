/*
 * 2. Create an interface with functionality of calculating simple interest,compound interest on principal amount based on given interest rates.

Provide implementation of these functionality in a class
 */

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************Interest Calculator**************");
		SimpleAndCompoundInterestCalculator calculate = InterestCalculator.getInstance();
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			System.out.println("\n------MENU-------");
			System.out.println("1. Simple Interest Calculator");
			System.out.println("2. Coumpound Interest Calculator");
			System.out.println("3. Exit");
			System.out.println("\n**********************************************");
			
			System.out.println("\n Enter your choice : ");
			int choice = sc.nextInt();	
			
			if(choice == 3) 
			{	
				break;
			}		
			System.out.print("\nEnter Principal Amount : ");
			double principalAmount = sc.nextDouble();
			System.out.print("\nEnter Rate of Interest : ");
			double rateOfInterest=sc.nextDouble();
			System.out.print("\nEnter Time (in years) : ");
			double timeInYears = sc.nextDouble();
			
			switch(choice)
			{
				case 1:
					double interest = calculate.getSimpleInterest(principalAmount, rateOfInterest, timeInYears);
					System.out.println("\nSimple Interest : "+interest);
					System.out.println("Amount : "+(principalAmount+interest));
					System.out.println();
					break;
				case 2:
					interest=calculate.getCompoundInterest(principalAmount, rateOfInterest, timeInYears);
					System.out.println("\nCompound Interest : "+interest);
					System.out.println("Amount : "+(principalAmount+interest));
					System.out.println();
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
			
		}
		sc.close();
	}
	}


