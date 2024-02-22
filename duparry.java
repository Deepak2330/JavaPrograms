package java75;

public class duparry 
{
static void find(int a[])
{int i;
  int j;
	for( i=0;i<a.length;i++)
	{
		for( j=i+1;j<a.length-1;j++)
	{
		if(a[i]==a[j])
		{ continue;
			
		}
	}
		
	}
	System.out.println("Dup founf"+a[i]+"  at index : "+i);
	
	
}

public static void main(String[] args) {
 int a[]={1,2,3,3,4,1,3};
	find(a);
}
}
