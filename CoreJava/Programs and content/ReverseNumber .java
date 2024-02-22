/*Write a Java program to find the reverse of a given number
import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
    int n,r;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    n=sc.nextInt();
    System.out.println("Reverse of number is:");
    while(n>0)
    {
        r=n%10;//store the remainder
       rev = rev * 10 + digit;
        n=n/10;
        System.out.print(r);
    }
    }
}

/*    public class ReverseNumber
{
        public static void main(String[] args) 
{
            int num = 1234, rev = 0;
            while(num != 0) 
{
                int digit = num %10;
                rev = rev * 10 + digit;
                num /= 10;
            
            System.out.println("Reversed Number: " + rev);
       } 
    }
}
*/

            /*      step1---- num=123           step2 ---num=12   step3----1
                1. digit=12%10=2              digit=1%10=1          
                2. rev=0*10+2=0+2=2           rev=2*10+1=20+1=21
                3.  num/10=12/10=1            num/10=1/10=1 */

























  
     