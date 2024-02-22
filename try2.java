package amcat;

public class try2 AC

{
  public static void main(String[] args)
{
 int [] ar={5,3,4,6,1};
 int n=5;// size
 
int[] r = new int [n];// int [] 
int temp;
	for (int i=0; i<n;i++ )
	{
		for( int j=1;j<(n-1);j++)
		{
			if(ar[j-1]>ar[j])
			{
				temp =ar[j-1];
				ar[j-1]=ar[j];
				ar[j]=temp;
			}
		}
  r[n]={ar[i-1],ar[j]};
		
	}
System.out.print("Sorted array:" + r[]);	

}
}