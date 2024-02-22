package repeat;

public class prime {
	public static void main(String[] args) {
	int n=23;
	 int[] ar={1,2,4,5,6,8,11};
	 for(int j=0;j<ar.length;j++)
	 { 
		 n=ar[j];
	if(n==0||n==1){
		System.out.println("Non prime");
		
	}
	else if(n==2)
	{
		System.out.println("prime");
	}
	for (int  i=2;i<=n/2;i++)
	{
		if((n%i)==0)
		{
			System.out.println("non prime-----"+ar[j]);
		break;
		}
		else {
			System.out.println("prime----"+ar[j]);
			break;}
	}
	
	 }
	}

}
