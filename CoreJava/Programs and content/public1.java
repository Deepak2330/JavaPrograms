/*4) Public
The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.

Example of public access modifier*/

//save by A.java  
  

public class A
{  
public void msg()
{
System.out.println("Hello");
}  
}  
//save by public1.java  
  
  
public class public1
{  
  public static void main(String args[])
{  
   A obj = new A();  
   obj.msg();  
  }  
}  