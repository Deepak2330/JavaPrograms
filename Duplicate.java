package amcat;

import java.util.Scanner;
import java.lang.*;
public class Duplicate
{

	 
	      static  void dup(int[] ar)
	       { //int e;
	    	  // int[] ar=new ar[e=sc.next()];
	  
		  for(int i=0;i<ar.length;i++)
		  {
			  for (int j=i+1;j<(ar.length);j++)
			  {
			  if(ar[i]==ar[j])
			  {
				  		  
				  System.out.println("Dup found>>"+ ar[i]);
				  System.out.println( ar[i]+" "+ar[j]);
			  }
			  
			  }
		  }
		 // int[] cr;
	
		  
			 // System.out.println("Not found"); 
		  
	  }
	  public static void main(String[] args)	
	  {   
		  int e;
		 
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the no of elments");
		  	
		  e=sc.nextInt();
		 		  int ar[]=new int [e];
		          int cr[]=new int[e];
		  System.out.println("Enter the  elments");
		  for(int i=0;i<e;i++)
		  {
			  ar[i]=sc.nextInt();
		  }
		 
		  System.out.println("Array "+" ");
		  
		  for(int i=0;i<ar.length;i++)
		  {
			  System.out.print(ar[i]);
		  }
		  System.out.println();
		  
		  //Duplicate d = new Duplicate();
		//dup(ar);
		System.arraycopy(ar,0,cr,0,ar.length);
		for(int i=0;i<cr.length;i++){
			System.out.println(cr[i]);
		}
	  
	  
	  }
	/*private static void arraycopy(int[] ar, int i, int[] cr, int j, int e) {
		int k;
		for(k=0;k<ar.length;k++)
		{
			for(j=0;j<ar.length;j++)
			cr[k]=ar[j];
		}
		

		System.out.println("++++++++++++++++++");
		
		//for( k=0;k<ar.length;)
		//{
		System.out.print(cr[k]);
		//k++;
	//    }
	
		
	}	*/
}