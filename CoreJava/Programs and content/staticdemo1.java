/*Java Static Block
-----------------
The static block is a block of statement inside a Java class that will be executed when a class is first loaded into the JVM

class Test
{
 static 
{
 //Code goes here
 }
}

A static block helps to initialize the static data members, just like constructors help to initialize instance members

//Following program is the example of java static block.
//------------------------------------------------------

//Example: How to access static block*/
//-----------------------------------
public class staticdemo1
{
 static int a;
 static int b;
 public staticdemo1()
 {
   a = 10;
    b = 20;
 }
 public static void main(String args[]) 
{

   staticdemo1 s1=new staticdemo1();

  System.out.println("Value of a = " + a);
  System.out.println("Value of b = " + b);

 }
}
	