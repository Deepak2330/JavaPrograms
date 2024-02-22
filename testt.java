package repeat;

public class testt {

	public static void main(String[] args) {
	
	
	String str=new String();
	str="Akash";
	String str1="Ramesh";
	String STR=str.concat(str1+" "+str);
/////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println(STR);
	System.out.println(str+"  "+STR);
	//////////////////////////////////////////////////////////////////////////////////////////////////
	StringBuffer s= new StringBuffer();
	 String D="See this one";
	System.out.println(s);
	StringBuffer H=s.append(STR);
	StringBuffer R=s.append(D);
	System.out.println(s.append(D));
	System.out.println(H);
	
}
}
