//This class is made as a thread by implementing "Runnable" interface.
 
public class FirstThread implements Runnable
{
 
  //This method will be executed when this thread is executed
  public void run()
  {
 
    //Looping from 1 to 10 to display numbers from 1 to 10
    for ( int i=1; i<=10; i++)
    {
        //Displaying the numbers from this thread
        System.out.println( "Messag from First Thread : " +i);
 
       /*taking a delay of one second before displaying next number
        *
        * "Thread.sleep(1000);" - when this statement is executed,
        * this thread will sleep for 1000 milliseconds (1 second)
        * before executing the next statement.
        *
        * Since we are making this thread to sleep for one second,
        * we need to handle "InterruptedException". Our thread
        * may throw this exception if it is interrupted while it
        * is sleeping.
        *
        */
        try
        {
           Thread.sleep (1000);
        }
        catch (InterruptedException interruptedException)
        {
           /*Interrupted exception will be thrown when a sleeping or waiting
            *thread is interrupted.
            */
            System.out.println( "First Thread is interrupted when it is sleeping" +interruptedException);
        }
    }
  }
}


//This class is made as a thread by implementing "Runnable" interface.
public class SecondThread implements Runnable
{
 
   //This method will be executed when this thread is executed
   public void run()
   {
 
      //Looping from 1 to 10 to display numbers from 1 to 10
      for ( int i=1; i<=10; i++)
      {
         System.out.println( "Messag from Second Thread : " +i);
 
        /*taking a delay of one second before displaying next number
         *
         * "Thread.sleep(1000);" - when this statement is executed,
         * this thread will sleep for 1000 milliseconds (1 second)
         * before executing the next statement.
         *
         * Since we are making this thread to sleep for one second,
         * we need to handle "InterruptedException". Our thread
         * may throw this exception if it is interrupted while it
         * is sleeping.
         */
         try
         {
             Thread.sleep(1000);
         }
         catch (InterruptedException interruptedException)
         {
            /*Interrupted exception will be thrown when a sleeping or waiting
             * thread is interrupted.
             */
             System.out.println( "Second Thread is interrupted when it is sleeping" +interruptedException);
         }
      }
    }
}

Main Class which starts the �First Thread� and �Second Thread�

public class ThreadDemo1
{
     public static void main(String args[])
     {
        //Creating an object of the first thread
        FirstThread   firstThread = new FirstThread();
 
        //Creating an object of the Second thread
        SecondThread   secondThread = new SecondThread();
 
        //Starting the first thread
        Thread thread1 = new Thread(firstThread);
        thread1.start();
 
        //Starting the second thread
        Thread thread2 = new Thread(secondThread);
        thread2.start();
     }
}
