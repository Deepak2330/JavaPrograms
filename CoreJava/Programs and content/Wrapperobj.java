public class Wrapperobj
{
public static void main (String args[])
{
int i=100;
/* create Integer wrapper object by using wrapper constructor*/
Integer i1=new Integer(i);
/* create Integer wrapper object by using valueOf() method */
Integer i2=Integer.valueOf("200");

/*print the value of primitives*/
System.out.println("The primitive value ofi1="+i1.intValue());
System.out.println("The primitive value ofi2="+i2.intValue());

String str1="12345";
/*convert string str1 to primitive int*/
int num2=Integer.parseInt(str1);
/*print the value of num2 */
System.out.println("The value of num2="+num2);

/*Print the string representstion of Integer objectsi1 and i2*/
System.out.println("The String value of i1="+i1.toString());
System.out.println("The String value of i2="+i2.toString());
}
}