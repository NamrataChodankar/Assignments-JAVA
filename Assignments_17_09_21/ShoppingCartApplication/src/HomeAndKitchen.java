

public class HomeAndKitchen 
{

private int Id;
private String Name;
private String Decription;
private int Price;

public HomeAndKitchen() 
{
super();
// TODO Auto-generated constructor stub
}

public HomeAndKitchen(int id, String name, String description, int price) 
{
super();
Id = id;
Name = name;
Decription = description;
Price = price;
}

public int getId() {
return Id;
}

public void setId(int id) {
Id = id;
}

public String getName() {
return Name;
}

public void setName(String name) {
Name = name;
}

public String getDecription() {
return Decription;
}

public void setDecription(String decription) {
Decription = decription;
}

public int getPrice() {
return Price;
}

public void setPrice(int price) {
Price = price;
}

@Override
public String toString() {
	return "HomeAndKitchen [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
}





}