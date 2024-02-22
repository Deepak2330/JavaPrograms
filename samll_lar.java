package java75;

public class samll_lar 
{
static void find(int a[])
{ int small=0;
 int large=0;
 
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{  small=a[i];
			//System.out.println("Dup founf"+a[i]+"  at index : "+i);
			
		}
		if(a[i]>a[j])
		{  large=a[i];
			//System.out.println("Dup founf"+a[i]+"  at index : "+i);
				}
	}
		}
	System.out.println(small);
	System.out.println(large);
	}
public static void main(String[] args) {
 int a[]={1,2,3,3,4,1,3};
	find(a);
}
}



