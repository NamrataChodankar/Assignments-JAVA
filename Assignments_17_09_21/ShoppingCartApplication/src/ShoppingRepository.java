

import java.util.ArrayList;

public class ShoppingRepository
{
public static ArrayList<MobilesAndAccessories> list1;	
public static ArrayList<Clothes> list2;
public static ArrayList<ElectronicsAndAccessories> list3;
public static ArrayList<HomeAndKitchen> list4;


public void Repo() 
{
	
list1 =new ArrayList<MobilesAndAccessories>();
MobilesAndAccessories mobiles1= new MobilesAndAccessories();
mobiles1.setId(1);
mobiles1.setName("Mobile");
mobiles1.setDecription("Iphone 13");
mobiles1.setPrice(69000);	
list1.add(mobiles1);
MobilesAndAccessories mobiles2= new MobilesAndAccessories();
mobiles2.setId(2);
mobiles2.setName("HeadSets");
mobiles2.setDecription("Samsung Earbuds");
mobiles2.setPrice(6000);
list1.add(mobiles2);

list2 = new ArrayList<Clothes>();
Clothes clothes1 = new Clothes();
clothes1.setId(1);
clothes1.setName("TShirt");
clothes1.setDecription("Cotton");
clothes1.setPrice(1000);
list2.add(clothes1);
Clothes clothes2 = new Clothes();
clothes2.setId(2);
clothes2.setName("Jeans");
clothes2.setDecription("Cotton");
clothes2.setPrice(2000);
list2.add(clothes2);


list3 = new ArrayList<ElectronicsAndAccessories>(); 
ElectronicsAndAccessories electronic1 = new ElectronicsAndAccessories();
electronic1.setId(1);
electronic1.setName("Washing Machine");
electronic1.setDecription("LG 221");
electronic1.setPrice(15000);
list3.add(electronic1);
ElectronicsAndAccessories electronic2 = new ElectronicsAndAccessories();
electronic2.setId(2);
electronic2.setName("Television");
electronic2.setDecription("Sony Bravia");
electronic2.setPrice(150000);
list3.add(electronic2);


list4 = new ArrayList<HomeAndKitchen>();
HomeAndKitchen hak1 = new HomeAndKitchen();
hak1.setId(1);
hak1.setName("Cookware");
hak1.setDecription("Pigeon Pan");
hak1.setPrice(2000);
list4.add(hak1);
HomeAndKitchen hak2 = new HomeAndKitchen();
hak2.setId(2);
hak2.setName("Purifiers");
hak2.setDecription("Aquaguard Aura");
hak2.setPrice(10000);
list4.add(hak2);
}
}