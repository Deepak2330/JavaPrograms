
public class StrRev
{

 public static void rev(String str)
 { String REVERSED="";
 int n=str.length();
 for(int i=n-1;i>=0;i--)
 {
	 REVERSED=REVERSED+str.charAt(i);
 
 }
System.out.println("REVERSED STRING:"+""+REVERSED);
 
}
 public static void funrev(String str){
	 {String REVERSED="";
	
		 char[] ch=str.toCharArray();
		 for(int i=ch.length-1;i>=0;i--)
		 {
			 REVERSED=REVERSED+ch[i];
		 }
		 System.out.println("REVERSED STRING:"+""+REVERSED);
		 }
 }
	 public static void  bUFrev(String str)
	 {
		 StringBuffer s=new StringBuffer(str);
		StringBuffer REVSTR= s.reverse();
		System.out.println("REVERSED STRING:"+""+REVSTR);
	 }
 

public static void main(String[] args) 
{
  String str="akash";
  rev(str);
  funrev(str);
  bUFrev(str);
}




}

