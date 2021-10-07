

import java.util.Scanner;

public class Functions extends ShoppingRepository
{
int Num;
int Quantity;
int Sum ;



ShoppingController con=new ShoppingController();


//Mobiles
public  void viewMobilesAndAccessories()
{   
System.out.println(">>>>>ELECTRONICS MENU");
System.out.println("ITEM ID\t\tBRAND NAME\t\tDESCRIPTION\t\tPRICE");
System.out.println("---------------------------------------------------------------------------------");
System.out.println();
for(MobilesAndAccessories mobiles:list1) 
{
System.out.println(+mobiles.getId()+"\t\t"+mobiles.getName()+"\t\t"+mobiles.getDecription()+"\t\t"+mobiles.getPrice()+".00\t");

}
System.out.println();
System.out.println("Enter ID to Buy Product");
Scanner sc = new Scanner(System.in);
Num = sc.nextInt();
System.out.println("Enter Quantity");
Quantity = sc.nextInt();
for(MobilesAndAccessories mobiles:list1)
{
if(Num==mobiles.getId())
{
Sum = Sum+(mobiles.getPrice())*Quantity;
System.out.println("ADD To Cart!! Total Amount "+Sum);
}
}
}

//Clothing
public  void viewClothing()
{   
System.out.println(">>>>>>Clothes MENU");
System.out.println("ITEM ID\t\tBRAND NAME\t\tDESCRIPTION\t\tPRICE");
System.out.println("---------------------------------------------------------------------------------");
System.out.println();
for(Clothes clothes:list2) 
{
	System.out.println(+clothes.getId()+"\t\t"+clothes.getName()+"\t\t"+clothes.getDecription()+"\t\t"+clothes.getPrice()+".00\t");

}
System.out.println("Enter ID to Buy Product");
Scanner sc = new Scanner(System.in);
Num = sc.nextInt();
System.out.println("Enter Quantity");
Quantity = sc.nextInt();
for(Clothes clothes :list2)
{
if(Num==clothes.getId())
{
Sum = Sum+(clothes.getPrice())*Quantity;
System.out.println("ADD To Cart!! Total Amount "+Sum);
}
}
}

//electronics

//home and kitchen




public void viewElectronicsAndAccessories() {
	// TODO Auto-generated method stub
	System.out.println(">>>>>ELECTRONICS AND ACCESSORIES MENU");
	System.out.println("ITEM ID\t\tBRAND NAME\t\tDESCRIPTION\t\tPRICE");
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println();
	for(ElectronicsAndAccessories electronics:list3) 
	{
	System.out.println(+electronics.getId()+"\t\t"+electronics.getName()+"\t\t"+electronics.getDecription()+"\t\t"+electronics.getPrice()+".00\t");

	}
	System.out.println();
	System.out.println("Enter ID to Buy Product");
	Scanner c = new Scanner(System.in);
	Num = c.nextInt();
	System.out.println("Enter Quantity");
	Quantity = c.nextInt();
	for(ElectronicsAndAccessories electronics:list3)
	{
	if(Num==electronics.getId())
	{
	Sum = Sum+(electronics.getPrice())*Quantity;
	System.out.println("ADD To Cart!! Total Amount "+Sum);
	}
	}
}

public void viewHomeAndKitchen() {
	// TODO Auto-generated method stub
	System.out.println(">>>>>>HOME AND KITCHEN MENU");
	System.out.println("ITEM ID\t\tBRAND NAME\t\tDESCRIPTION\t\tPRICE");
	System.out.println("---------------------------------------------------------------------------------");
	System.out.println();
	for(HomeAndKitchen homeAndKitchen:list4) 
	{
		System.out.println(+homeAndKitchen.getId()+"\t\t"+homeAndKitchen.getName()+"\t\t"+homeAndKitchen.getDecription()+"\t\t"+homeAndKitchen.getPrice()+".00\t");

	}
	System.out.println("Enter ID to Buy Product");
	Scanner s = new Scanner(System.in);
	Num = s.nextInt();
	System.out.println("Enter Quantity");
	Quantity = s.nextInt();
	for(HomeAndKitchen homeAndKitchen :list4)
	{
	if(Num==homeAndKitchen.getId())
	{
	Sum = Sum+(homeAndKitchen.getPrice())*Quantity;
	System.out.println("ADD To Cart!! Total Amount "+Sum);
	}
	}

	}
}
