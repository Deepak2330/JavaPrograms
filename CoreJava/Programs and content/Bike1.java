//program on abstract class
abstract class Bike //abstract class
{  
  abstract void run();  //abstract method
}  

class Honda4 extends Bike

{  
void run()
{
System.out.println("running safely");
}  
}
class Bike1
{
public static void main(String args[])
{  
 Bike obj = new Honda4();  
 obj.run();  
}  
}
  