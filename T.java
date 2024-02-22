package amcat;

import java.util.Scanner;

public class T
{ 
	public static void main(String[] args)
	{
		int ap=0;
		int bp=0;
	int [] a=new int[3];
  int [] b=new int[3];
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a value");
  for(int i=0;i<3;i++)
  {
	  a[i]=sc.nextInt();
  }
  for(int i=0;i<3;i++)
  {
	 System.out.print(a[i]+" ");
 
  }
  System.out.println();
  System.out.println("Enter b value");
  for(int i=0;i<3;i++)
  {
	  b[i]=sc.nextInt();
  }
  for(int i=0;i<3;i++)
  {
	 System.out.print(b[i]+" ");
  
  }
  for(int i=0;i<3;i++)
  {
	if(a[i]>b[i])
	{
		ap=ap+1;
	}
	else if(a[i]<b[i])
	{
		bp=bp+1;
	}
  }
  System.out.print("outpu" + ap +" "+bp);
  
  
}
}
