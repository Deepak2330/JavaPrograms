package softsovaa;

public class try1 {

	 
	public static void fun()
	{
		
		
		
	}
	
	
public static void main(String[] args) {
	int[] given ={1221,11222,2233,1212,123};
//	int[] ter=new int[100];
	int sum=0;
	int n;
	int r;
	int count1=0,count2=0,count3=0;
	for(int i=0;i<given.length;)
	{
		n=given[i];
		System.out.println(given[i]);
		while(n>0)
		{
		r=n%10;//1
		n=n/10;
		if(r==1)
		{
			count1++;
		}
		else if(r==2)
		{
			count2++;
		}
		else if(r==3)
		{
			count3++;
		}
		}
		
if(count1==count2)
{
	System.out.println("s"+given[i]);
	sum=sum+given[i];
}

else if(count2==count3)
{
	System.out.println("s"+given[i]);	
	sum=sum+given[i];
}
i++	;}

	System.out.println(sum);
	}


}
