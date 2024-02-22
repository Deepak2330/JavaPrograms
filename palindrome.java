package repeat;

public class palindrome {
 public static void main(String[] args) {
	
	int n=153;
	int temp=n;
	int r;
	int sum=0;
	
	while(n>0)
	{
		r=n % 10;
		sum=(sum)+(r*r*r);
		n=n/10;
	}
	if(sum==temp)
	{
		System.out.println("YES PAL");
	}
	else
	{
		System.out.println("no");
	}
	
}
}

