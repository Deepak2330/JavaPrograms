package amcat;

public class Ehandling 
{
	static void disp() throws InterruptedException
	{
	try{
	for(int i=0;i<6;i++)

	{
		System.out.println(i);
		Thread.sleep(3300);
	}
	}
	catch(InterruptedException e)
	{
		System.out.println("SEDR");
	}
	}

static void dothu() throws ArithmeticException
{
	System.out.println(10/0);
}


public static void main(String[] args) 
{
//	try
//	{
//	//disp();
//}
////catch ( InterruptedException e)
//	{
//	System.out.println("handaled");
//	}

try
{
dothu();
}
catch(ArithmeticException e)
{
	System.out.println("Dandeled");
}
//disp();
}

}
