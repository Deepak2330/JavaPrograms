
//Program to Convert CharArray To String
import java.lang.*;

public class convertchar
{
	public static void main(String []args)
	{
		// declare String object
		String str="";     
                int i;
		// declare character array
		char  ch[]= new char[]{'H','e','l','l','o'};   

		 // convert char array to string
		str= new String(ch);  

		//print string
             System.out.println("Character Array...."); 
              for(i=0;i<ch.length;i++)
              {
                            System.out.println(ch[i]);  
             }
 
		System.out.println("String :" +str);
	}
}