package Patterns;

public class Triangles {
	static int numberOftimes;

	public void  rightTriangle() 
	{
		for(int i= 1; i <numberOftimes ; i++ ) 
		{
			
			for(int j= 1 ; j < i ; j++ ) 
			{
				
				System.out.print(j +" ");
				
			}
			System.out.println("\n");
		}
		
	}
	

	
	public void  lefttTriangle() 
	{
		for(int i= 1; i <numberOftimes ; i++ ) 
		{
			
			for(int j= 2*(numberOftimes-i) ; j >= 0 ; j-- ) 
			{				
				System.out.print(" ");
			}
			for(int j= 1 ; j < i; j++ ) 
			{				
				System.out.print(j);
			}
			
			
			System.out.println("\n");
		}
		
	}
	public void triangle() {
		 // outer loop to handle number of rows
       //  n in this case
       for (int i=0; i<numberOftimes; i++)
       {

           // inner loop to handle number spaces
           // values changing acc. to requirement
           for (int j=numberOftimes-i; j>1; j--)
           {
               // printing spaces
               System.out.print(" ");
           }
 
           //  inner loop to handle number of columns
           //  values changing acc. to outer loop
           for (int j=0; j<=i; j++ )
           {
               // printing stars
               System.out.print("*");
           }
 
           // ending line after each row
           System.out.println();
       }
		
	}
	
	
	public static void main(String[] args) {
		numberOftimes =9;
		Triangles tr = new Triangles();
		//tr.rightTriangle();
	    // tr.lefttTriangle();
		tr.triangle();
	}

}
