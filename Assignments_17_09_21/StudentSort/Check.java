package Assignment_17_09_21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Check
{
    public static ArrayList<Student> list;
    
    public static void PrintStudentData() 
    {
    	for(Student st : list)
		{
			System.out.println(st);
		}
    }
    
	public static void main(String[] args)
	{
		int count=1;
		list = new ArrayList<Student>();
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<2;i++)
			{
				Student student = new Student();
				System.out.println("Enter Student Data :"+count);
				
				System.out.println("Enter Roll Number");
				student.setRoll_No(sc.nextInt());
				
				System.out.println("Enter First Name");
				student.setFirst_Name(sc.next());
				
				System.out.println("Enter Last Name");
				student.setLast_Name(sc.next());
				
				System.out.println("Enter Age");
				student.setAge(sc.nextInt());
				
				System.out.println("Enter Semester 1st Marks");
				student.setSem_1_marks(sc.nextInt());
				
				System.out.println("Enter Semester 2nd Marks");
				student.setSem_2_marks(sc.nextInt());
				
				System.out.println("Enter Semester 3rd Marks");
				student.setSem_3_marks(sc.nextInt());
				
				
				int sum = student.getSem_1_marks()+student.getSem_2_marks()+student.getSem_3_marks();
				int total = sum/3;
				student.setPercentage(total);

				
			list.add(student);
			count++;
			}
		}
		System.out.println("\nOriginal Record");
		System.out.println("__________________________________________________________________________________________________");
		PrintStudentData();
		System.out.println("__________________________________________________________________________________________________");
		         System.out.println("\n---------------Student Record Sorted By Age----------------");
                 Collections.sort(list, new SortByAge());
                 PrintStudentData();
                 
                 System.out.println("__________________________________________________________________________________________________");
                 System.out.println("\n---------------Student Record Sorted By First Name------------");
                 Collections.sort(list, new SortByFirstName());
                 PrintStudentData();
                 
                 System.out.println("___________________________________________________________________________________________________");
                 System.out.println("\n---------------Student Record Sorted By Last Name-------------");
                 Collections.sort(list, new SortByLastName());
                 PrintStudentData();
                 
                                
                 System.out.println("____________________________________________________________________________________________________");
                 System.out.println("\n-------------Student Record Sorted By Percentage------------");
                 Collections.sort(list, new SortByPercentage());
                 PrintStudentData();
                
	}

}