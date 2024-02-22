//Program to add,subtract,product, divide and find remainder of two numbers
public class Display  // public class
{
public static void main (String str[])  
{
 int a,b,add=0,subtract=0, product=0,divide=0,rem=0;
a=5; b=3;
add=a+b;
subtract=a-b;
product=a*b;
divide=a/b;
rem=a%b;
System.out.println ("\n\t Addition:" +add); 
System.out.println ("\n\t Subtraction:" +subtract);
System.out.println ("\n\t Multiplication:" +product);
System.out.println ("\n\t Division:" +divide);
System.out.println ("\n\t Remainder:" +rem);
     }
}