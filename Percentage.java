//1. Create an array with five scores out of 100, compute the average of the scores and compute percentage.
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {80,96,88,91,79};
		float percent=0;
		float sum=0;
		for(int num:array)
			sum=sum+num;
		percent=(sum*100)/500;
		System.out.println("Percentage is:"+percent);	
		}
		


}