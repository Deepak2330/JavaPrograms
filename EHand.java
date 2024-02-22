package SoftSuave;

public class EHand {
	public static void main(String[] args) {
	try{
		System.out.println(5/0);
	}
		catch(Exception e)
	{
			System.out.println("exeception");
	}
//		catch(ArithmeticException e)
//	{https://www.geeksforgeeks.org/cerner-interview-experience-on-campus-2020-virtual/
//			System.out.println("ae");
//	}
	System.out.println("last line");
	
	int i=0,j=5;
tp:for(;;)
	{ i++; 
		if(i>--j){
			break tp;
		}
	}
	System.out.println("i=="+ i+" "+"j=="+j);
	
	
	
	
	
	
	
	}

}



