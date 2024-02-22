package amcat;
//import java.util.Scanner;
public class try1 
{ 
public static void main(String[] args)
{ 

	 int i, j;  
	 for(i=0; i<4; i++) //outer loop for number of rows(n) 
		 {
		 { for(j=2*(4-i); j>=0; j--) // inner loop for spaces 
     {           
         System.out.print(" "); // printing space
     } 
     for(j=0; j<=i; j++) //  inner loop for columns
     {       
         System.out.print("* "); // print star
     }           
     System.out.println(); // ending line after each row
 } 
}
     }
}
	   


	  



