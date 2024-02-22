//program on if..else if..else (else..if ladder)

import java.util.Scanner;
class ifelse2
{
public static void main(String str[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
a=sc.nextInt();

System.out.println("Enter the value of b:");
b=sc.nextInt();

System.out.println("Enter the value of c:");
c=sc.nextInt();

if(a>b && a>c)
{
System.out.println("A is bigger...");
}
else if(b>a && b>c)
{
System.out.println("B is bigger...");
}
else
{
System.out.println("C is bigger...");
}
}
}
