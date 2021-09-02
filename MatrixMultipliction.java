//2. Create two 3 X 3 matrices and perform multiplication of matrices.
public class MatrixMultipliction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]={{2,2,2},{2,2,2},{2,2,2}};    
		int b[][]={{2,2,2},{2,2,2},{2,2,2}};    
		int c[][]=new int[3][3]; 
		   
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				c[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}  
				System.out.print(c[i][j]+"\t"); 
			}  
			System.out.println();   
		}    
		
		
		
	}

}
