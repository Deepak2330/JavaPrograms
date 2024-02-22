package repeat;

public class thbsagain {
	
	public static void fun(int[] ar,int l)
	{int sum=0;
	int rsum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		for(int j=ar[0];j<l;j++)
		{
			rsum=rsum+1;
		}
	
	System.out.println(sum);
	System.out.println(rsum);
	}
	public static void main(String[] args) {
		int[] ar={1,2,3,5,6};
		fun(ar,6);
	}

}
