/* 
What is Encapsulation?
----------------------
The whole idea behind encapsulation is to hide the implementation details from users. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class.

Steps
-------
If we setup public getter and setter methods to update (for example void setSSN(int ssn))and read (for example  int getSSN()) the private data fields then the outside class can access those private data fields via public methods.

This way data can only be accessed by public methods thus making the private fields and their implementation hidden for outside classes. That’s why encapsulation is known as "data hiding"

Example of Encapsulation in Java
--------------------------------
How to implement encapsulation in java:
1) Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
2) Have getter and setter methods in the class to set and get the values of the fields.
*/

class EncapsulationDemo
{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
   public void setEmpAge(int newValue)
   {
        empAge = newValue; 
    }

    public void setEmpName(String newValue)
      {
        empName = newValue;
    }

    public void setEmpSSN(int newValue)
    {
        ssn = newValue;//
    }

    public int getEmpSSN() 
    {
        return ssn;
    }

    public String getEmpName()
   {
        return empName;
    }

    public int getEmpAge()
    {
        return empAge;
    }

    
}
public class EncapsTest
{
    public static void main(String args[])
{
         
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mary");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());

      
    } 
}