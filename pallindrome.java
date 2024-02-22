package amcat;

public class pallindrome 
{
  public static void palStr(String Var)
  {
	  StringBuilder sd =new StringBuilder(Var);
	  StringBuilder reverse = sd.reverse();
	  
	  if(sd==reverse){
		  System.out.println("reversed"+reverse);
	  }
	
	int n=Var.length();
	String Str="";
	for(int i=n-1;i>=0;i--)
	{
		Str=Str+Var.charAt(i);
	}
	  
	if(Var.equals(Str))
	{
		System.out.println("It's a pallindrome");
	}
	else {
		System.out.println("Not a pallindrome");
	}
			  
  }
public static  void palnum(int a)
{
	int temp=a;
	int r;
	int sum=0;
	
	while(a>0)
	{
	r=a%10;
	sum=sum*10+r;
	a=a/10;
	}
	
	if(sum==temp)
	{
		System.out.println("It's a pallindrome");
		
	}
	else {
		System.out.println("Not a Pallindrome");
	}
}
public static void main(String[] args) {

	String Var="Good_Evening";
	palStr(Var);
	 int a=1221;
	 palnum(a);
	
	
}


}
