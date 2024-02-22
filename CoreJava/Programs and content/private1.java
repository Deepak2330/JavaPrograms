/*Simple example of private access modifier

In this example, we have created two classes A and private1. A class contains private data member and private method. We are accessing these private members from outside the class, so there is a compile-time error.*/

class B
{  
private int data=40;  

private void msg()
{
System.out.println("Hello java");
}  
}  
  
public class private1
{  
 public static void main(String args[])
{  
   B obj=new B();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  