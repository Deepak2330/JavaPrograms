/*The this keyword
------------------
this is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor. Using this you can refer the members of a class such as constructors, variables and methods.

Note - The keyword this is used only within instance methods or constructors

This
In general, the keyword this is used to -

Differentiate the instance variables from local variables if they have same names, within a constructor or a method.

class Student {
   int age;   
   Student(int age) {
      this.age = age;	
   }
}
Call one type of constructor (parametrized constructor or default) from other in a class. It is known as explicit constructor invocation.

class Student {
   int age
   Student() {
      this(20);
   }
   
   Student(int age) {
      this.age = age;	
   }
}*/



public class this1 {
   // Instance variable num
   int num = 10;
	
   this1() {
      System.out.println("This is an example program on keyword this");	
   }

   this1()(int num) 
    {
      // Invoking the default constructor
      this();
      
      // Assigning the local variable num to the instance variable num
      this.num = num;	   
   }
   
   public void greet() {
      System.out.println("Hi Welcome to Tutorialspoint");
   }
      
   public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : "+num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : "+this.num);
      
      // Invoking the greet method of a class
      this.greet();     
   }
   
   public static void main(String[] args) {
      // Instantiating the class
      this1 obj1 = new this1();
      
      // Invoking the print method
      obj1.print();
	  
      // Passing a new value to the num variable through parametrized constructor
    this1 obj2 = new this1(30);
      
      // Invoking the print method again
      obj2.print(); 
   }
}
