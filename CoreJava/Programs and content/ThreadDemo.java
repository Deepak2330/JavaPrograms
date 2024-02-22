/*Lab-2 Write a Java program that creates three threads. First thread displays �Good Morning� every one second, the second thread displays �Hello� every two seconds and the third thread displays �Welcome� every three seconds.*/


class A extends Thread
{
     synchronized public void run()
     {
    try
    {
        while(true)
        {
           sleep(1000);
           System.out.println("good morning");
        }
    }
    catch(Exception e)
    { }
      }
}
class B extends Thread
{
      synchronized public void run()
      {
    try
    {
        while(true)
        {
        sleep(2000);
        System.out.println("hello");
        }
        }
      catch(Exception e)
    { }
      }
}
class C extends Thread
{
     synchronized public void run()
     {
    try
    {
        while(true)
        {
            sleep(3000);
            System.out.println("welcome");
        }
    }
    catch(Exception e)
    { }
     }
}
class ThreadDemo
{
    public static void main(String args[])
    {
        A t1=new A();
        B t2=new B();
        C t3=new C();
        t1.start();
        t2.start();
        t3.start();
    }
}