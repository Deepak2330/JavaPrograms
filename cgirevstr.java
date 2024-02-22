package repeat;

public class cgirevstr {
 public static void main(String[] args)
 {
    String Str="ytuyt";
    String rev="";
    char [] ch=Str.toCharArray(); 
  int n=ch.length;
    for(int i=n-1;i>=0;i--)
    {
    	    rev=rev+ch[i];
    }
 
    System.out.print(rev);
    System.out.print("================");
    if (Str.equals(rev))
    { 
    	System.out.println("Pallindrome");
    
    }
    else{
    	System.out.println("not");
    }
    
StringBuffer s1=new StringBuffer(Str);
StringBuffer reev=s1.reverse();
 System.out.println(reev);
}
 
 
 }
 
 
 
	
	
	

