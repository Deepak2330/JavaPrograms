/*Example of method overriding
In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation. The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.*/

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  

class Vehicle
{  
 //defining a method  
  void run()
{
System.out.println("Vehicle is running");
}  
}
//Creating a child class  
class Bike2 extends Vehicle
{  
  //defining the same method as in the parent class  
  void run()
{
System.out.println("Bike is running safely");
}
}
  
class car extends Vehicle
{
//defining the same method in the parent class
void run()
{
System.out.println("Nice car..");
}
}
  
//Main class
class Vehicle1
{ 
 public static void main(String args[])
 {  
  Bike2 obj = new Bike2();//creating object  
  obj.run();//calling method  
  
  car c1=new car();//creating object
  c1.run();//calling method
 
  
  }  
}  