/*Java program to check whether a String is a palindrome or not. e.g radar
import java.util.Scanner;
public class PalineStr
{
public static void main(String[] args)
{
    String str;    
    String rev = "";//rev is set to empty
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String :");
str = sc.nextLine();  //Input the string "radar" to check palindrome 
for(int i=str.length()-1;i>=0;i--) //i=to get lengh of input str i.e 4. -1 as index starts from 0
    {
    rev=rev+str.charAt(i); //rev = r last char first. till all chars reverse is store if rev
    }
if(str.equalsIgnoreCase(rev)) 
    {
    System.out.println(str+" is a Palindrome..."); //str.equalsIgnoreCase with check rev and str are eaqual ignoring cases
    }else
    {
        System.out.println(str+" is NOT a Palindrome...");
    }
}
}*/

public class Fibonacci1 {
 
    public static void main(String[] args) 
    {
        
         int n = 10; 
         int f1 = 0;
         int f2 = 1;
         int f3=0;
         System.out.println(f1);
                System.out.println(f2);
            //System.out.print("Fibonacci Series of "+maxNum+" numbers:");
 
            for (int i = 1; i <= n; i++)
            {
               // System.out.print(previousNum+" ");
                 
          
                //int sum = previousNum + nextNum;
                //previousNum = nextNum;
                //nextNum = sum;                        
               f3=f1+f2;    
                f1=f2;
                f2=f3;
                
                System.out.println(f3);
                
                                 

            }
 
                
    }
 
}


      
          