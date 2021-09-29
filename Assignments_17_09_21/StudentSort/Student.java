package Assignment_17_09_21;

public class Student 
{

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int roll_No;
	  private String first_Name;
	  private String last_Name;
	  private int age;
	  private int sem_1_marks;
	  private int sem_2_marks;
	  private int sem_3_marks;
	  private int percentage;
	  
	  
	  public Student(int roll_No, String first_Name, String last_Name, int age, int sem_1_marks, int sem_2_marks,
				int sem_3_marks, int percentage) {
			super();
			this.roll_No = roll_No;
			this.first_Name = first_Name;
			this.last_Name = last_Name;
			this.age = age;
			this.sem_1_marks = sem_1_marks;
			this.sem_2_marks = sem_2_marks;
			this.sem_3_marks = sem_3_marks;
			this.percentage = percentage;
		}
	  

	  
	public int getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSem_1_marks() {
		return sem_1_marks;
	}
	public void setSem_1_marks(int sem_1_marks) {
		this.sem_1_marks = sem_1_marks;
	}
	public int getSem_2_marks() {
		return sem_2_marks;
	}
	public void setSem_2_marks(int sem_2_marks) {
		this.sem_2_marks = sem_2_marks;
	}
	public int getSem_3_marks() {
		return sem_3_marks;
	}
	public void setSem_3_marks(int sem_3_marks) {
		this.sem_3_marks = sem_3_marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [roll_No = " + roll_No + ", first_Name = " + first_Name + ",  last_Name = " +
	            last_Name + ",   age = "+ age + ", sem_1_marks = " + sem_1_marks + ",   sem_2_marks = " +
				sem_2_marks + ",   sem_3_marks = " + sem_3_marks+ ",   percentage = " + percentage + "%]";
	}	  
}


