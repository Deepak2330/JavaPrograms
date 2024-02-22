package amcat;

import java.util.Scanner;

public class cusEhan extends RuntimeException
{ public static void main(String[] args) {
	

 //System.out.println("Enter the No");
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter no");
 long mob =sc.nextLong(); 
 System.out.println(mob);
	int num=(int )String.valueOf(mob).length();
		System.out.println("======+++++++++++============");
	//System.out.println(String.valueOf(mob));
	if(num==10)
	{
		System.out.println(num);
	}
	else
	{
		try {
			cusEhan e=new cusEhan();
			throw e;
		}
		catch (cusEhan e) {
			System.out.println("Limit Invalid");
			System.out.println(num);
		}
	}
}
}
