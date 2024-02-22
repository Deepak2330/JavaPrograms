
public class vlsss {
	
	public static void amstr(int n)
	{ int r;
	 int sum=0;
	 int temp=n;
		while(n>0)
		{
				r=n%10;
					sum=sum+r*r*r;
					n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("yes");
			
		}
		else{
			System.out.println("no");
		}
	}
	/////////////////#################################################???????????????????//////
	public static void rev(String str)
	{   String s=new String(str);
			char[] Rev=s.toCharArray();
      for(int i=Rev.length-1;i>=0;i--)
      {
    	  System.out.print(Rev[i]);
      }
		
	}
/////////////////#################################################???????????????????//////
	public static void perfectsq(int n)
	{int r;
		for(int i=1;i<n/2;i++)
		{
			r=i*i;
			
			if(r==n){
				System.out.println("yes perfect square");
				break;
			}
		}
	}
/////////////////#################################################???????????????????//////
	public  static void buble(int[] arr)
	{int i;
		for(i=0;i<arr.length-1;i++)
		{
			 for(int j=1; j < (arr.length-i); j++)
			 {
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			
		}
			 
		}
		for(i=0;i<arr.length;i++)
		 {
		 System.out.print(arr[i]+" ");	
}
	}
	///////////////////////////////////LLLLLLLLLLLLLLLLL//////////////////////////
	 public static void pall(int n,String str)
	 {
		 int temp=n;
		 int r;
		 int sum=0;
		 while(n>0)
		 {
			 r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
	   if(sum==temp)
	   {
		   System.out.println("Pallindrome");
	   }
	   else{
		   System.out.println(" not a palindrome");
	   }
	  StringBuffer t =new StringBuffer(str);
	  StringBuffer R=t.reverse();
	  System.out.println(R);
	  if(R.equals(str))
	  
	  {
		  System.out.println("pallindrome String");
	  }
 else{
	  
		  System.out.println("nOT pALINDROME STRING");  
  }
	   
	 }
/////////////////#################################################???????????????????//////
/////////////////#################################################???????????????????//////
/////////////////#################################################???????????????????//////
public static void main(String[] args) {
	
	int a=10;
	int b=9;
	int C= Math.abs(b-a);
	
	System.out.println(C);
	amstr(153);
	rev("TISSION");
	System.out.println();
	perfectsq(144);
	System.out.println();
	pall(1221,"DOOk");
	System.out.println("LLLLLLLLLLLLLLLLLLLLLLL");
	int[] arr={12,34,54,23,34,9,1};
	buble(arr);
	
}
}
