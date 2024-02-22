package softsovaa;

import java.util.Scanner;

public class inuo {
	int no=3; int[] sp=new int[16];int[] ep=new int[16];int i;
	public static void main(String[] args) {
		int no; int[] sp=new int[16];int[] ep=new int[16];
		Scanner sc=new Scanner(System.in);
		System.out.println("Started");
		System.out.println("Enter the no of buses");
		no=sc.nextInt();
		System.out.println("no of Busses"+no);
		
		System.out.println("Enter details");
		for(int i=1;i<=no;i++)
		{
			sp[i]=sc.nextInt();
			ep[i]=sc.nextInt();
		}

		for(int i=1;i<=no;i++)
		{
		System.out.println(sp[i]+"--->"+ep[i]);
		//System.out.println(sp[3]+"----"+ep[3]);
		}
  
		System.out.println("wait a second");
		boolean check=true;
		//boolean check=true;
		for(int i=1;i<no;i++)
		{
			
		if((sp[i+1]<ep[i])&&(ep[i]<ep[i+1]))//2<3&&3<4
		{
			check=false;
		}
		else{
			check=true;
		}
		
	if(check==false)
	{
	//(int k=1;k<no;k++)
		no=no-i;
	}
		}
	System.out.println(no);
	}
	
		
	
}

