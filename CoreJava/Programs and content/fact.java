import java.util.*;
import java.io.*;
class fact
{
    public static void main(String str[]) 
    {
        int n,c=0,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        n = sc.nextInt();
          
          for(int i=1;i<=n;i++)
          {    
              f=f*i;    
          }    
          System.out.println("Factorial of "+n+" is: "+f);  
                
    }
}
