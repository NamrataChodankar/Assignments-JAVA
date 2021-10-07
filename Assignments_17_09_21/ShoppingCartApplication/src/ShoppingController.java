

import java.util.Scanner;

public class ShoppingController 
{
public static void menuUI()
{
System.out.println("**********  WelCome To Shopping Cart  ***********");
System.out.println();

System.out.println(" << SELECT CATEGORIES");
System.out.println("1 MobilesAndAccessories");
System.out.println("2 Clothing");
System.out.println("3 ElectronicsAndAccessories");
System.out.println("4 HomeAndKitchen");
System.out.println("5 To Conformed Order");
System.out.println("6 To Exit From Shopping Cart");
System.out.println();


}
@SuppressWarnings("resource")
public static void main(String[] args)
{
Functions funtion = new Functions();
ShoppingRepository repo = new ShoppingRepository();
repo.Repo();
int option;
do
{
menuUI();
System.out.println("Press Number To Select Category");

Scanner sc = new Scanner(System.in);
option = sc.nextInt();
switch(option) 
{

case 1:funtion.viewMobilesAndAccessories();
System.out.println("*****************************************************************");
break;
case 2:funtion.viewClothing();
System.out.println("*****************************************************************");
break;
case 3:funtion.viewElectronicsAndAccessories();
System.out.println("*****************************************************************");
break;
case 4:funtion.viewHomeAndKitchen();
System.out.println("*****************************************************************");
break;


case 5:System.out.println("Thank You Happy Shopping!!!!");
System.out.println("Your Order Has Been Placed");
System.out.println("Amount to Be paid  "+funtion.Sum+".00");
System.exit(0);
}
}
while(option!= 6) ;




}
}
