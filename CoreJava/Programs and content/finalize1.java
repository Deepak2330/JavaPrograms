public class finalize1 {  
     public static void main(String[] args)   
    {   
        finalize1 obj = new finalize1();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}  