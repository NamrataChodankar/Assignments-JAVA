package Assignment_17_09_21;

import java.util.Comparator;

public class SortByPercentage implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{		
		return b.getPercentage()-a.getPercentage();
		
	}
}