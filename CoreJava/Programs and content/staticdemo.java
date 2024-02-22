//Program on static modifier


class Student 
{
static int a; //initialized to zero
static int b; //initialized to zero only when class is loaded not for each object created.

  Student()
   {
   //Constructor incrementing static variables a and b
 a++; 
  b++;//b=b+1
  }

   public void showData()
  {
      System.out.println("Value of a = "+a);
      System.out.println("Value of b = "+b);
   }



/*public static void inc()
{
a++;
}*/
}


public class staticdemo
{
   public static void main(String args[])
{
     Student s1 = new Student();
     s1.showData();
//s1.inc();
     Student s2 = new Student();
     s2.showData();
     //Student.b++;
     //s1.showData();
  }
}

