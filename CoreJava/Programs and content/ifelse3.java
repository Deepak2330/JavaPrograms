//program on nested..if

import java.util.Scanner;
class ifelse3
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

if(a>b) 
{
if(a>c)
{
System.out.println("A is bigger...");
}
}
if(b>a)
{
if(b>c)
{
System.out.println("B is bigger...");
}
}
if(c>a)
{

if(c>b)
{
System.out.println("C is bigger...");
}
}
}
}

