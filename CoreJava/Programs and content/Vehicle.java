//Program on Abstraction

abstract class Vehicle //base class
{
   public abstract void engine();  //abstract method...signature
}
public class Car extends Vehicle
 {
    
    public void engine()
    {
        System.out.println("Car engine");
        //car engine implementation
    }
    
    public static void main(String[] args)
    {
        Vehicle v = new Car();
        v.engine();
        
    }
}

     


     

