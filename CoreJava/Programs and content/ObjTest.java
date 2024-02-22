// Java program to demonstrate working of getClass() 
public class ObjTest 
{ 
    public static void main(String[] args) 
    { 
        Object obj = new String("Hello..Welcome to Object Class"); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "
                           + c.getName()); 
    } 
} 

/*Note: After loading a .class file, JVM will create an object of the type java.lang.Class in the Heap area. We can use this class object to get Class level information. It is widely used in Reflection*/
