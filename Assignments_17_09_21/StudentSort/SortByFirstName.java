package Assignment_17_09_21;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{
		return a.getFirst_Name().compareToIgnoreCase(b.getFirst_Name());
		
	}
}
