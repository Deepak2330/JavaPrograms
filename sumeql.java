package java75;

public class sumeql 
{  //int sum=0;
	static void tray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{int sum=a.length;
			if(sum==(a[i]+a[j]))
			{
				System.out.println("Pairs are"+a[i]+" "+a[j]);

			}
			
			}
		}

 
	}


public static void main(String[] args) 
{
	int a[]={1,2,3,3,4,1,3};
	tray(a);
}
}
