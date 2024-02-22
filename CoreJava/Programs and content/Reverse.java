//Write a Java program to find the reverse of a given number
import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
    int n,r,rev=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    n=sc.nextInt();
    System.out.println("Reverse of number is:");
    while(n>0)
    {
        r=n%10;//store the remainder
        rev = rev * 10 + r;
        n=n/10;
        System.out.print("\n\t Reverse Number:"+rev);
    }
    }
}

