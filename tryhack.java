package amcat;

public class tryhack 
{  
 public static void you(String Str)
 {
	 String s= new String (Str);
	//char[] ch= s.toCharArray();
//	
// System.out.println(ch[1]+Str);
// String S=(String)(ch[0]+ch[1]+Str);
// System.out.println(S);
	 String nw=Str.substring(0,2);
	 System.out.println(nw+Str);
 }
	

  public static void main(String[] args)
  {
	String Str="kitten";
	you(Str);

	
	
  }	
}
