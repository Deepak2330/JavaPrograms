import java.io.IOException;  
class throws1
{  
  void m()throws IOException
{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException
{  
    m();  
  }  
  void p()
{
 
   try
{  
    n();  
   }
catch(Exception e)
{
System.out.println("exception handled"+e.getMessage());

}  
  }  
  public static void main(String args[])
{  
   throws1 obj=new throws1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  