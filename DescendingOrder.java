//4. Create an array of type int with 10 elements.
//Sort the array in descending order.
public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int [] arr = new int [] {8,2,3,1,6,5,7,14,4,23};     
	        int temp = 0;     
	        System.out.println("Array Elements: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	          
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            for (int j = i+1; j < arr.length; j++) 
	            {     
	               if(arr[i] < arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	            
	        System.out.println();           
	        System.out.println("Elements sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}


