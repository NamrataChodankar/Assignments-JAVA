package Assignment_17_09_21;

import java.util.Comparator;

public class SortByLastName implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{		
		return a.getLast_Name().compareToIgnoreCase(b.getLast_Name());
		
	}
}
