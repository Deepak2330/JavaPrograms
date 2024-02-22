package amcat;
import java.lang.String;
import java.math.BigDecimal;import java.util.HashMap;
import java.util.StringTokenizer;

public class Stringss 
{ 
	public static void main(String[] args)
	{
		      String s=" akash ";
	  String s1= new String("Darshan");
	
	/*System.out.println(s);
	System.out.println(s1);*/
	
	//String C= concat("akaa","Akaaash");
	String r=s.concat(" M B");
	String s3=s1.concat(" M b ");
	String s4=s1+s;
	long start = System.currentTimeMillis();
	StringBuffer ss1= new StringBuffer();
	
	ss1.append("Darshan");
	ss1.append("MB");
	
	long end = System.currentTimeMillis();
	
	
	
	BigDecimal time=  new BigDecimal(end-start);
	System.out.println("time elapsed>>"+time);
	
	long start1 = System.currentTimeMillis();
	StringBuilder ss2= new StringBuilder();
	
	ss2.append("Darshan");
	ss2.append("MB");
	
	long end1 = System.currentTimeMillis();
	
	BigDecimal time1=  new BigDecimal(end1-start1);
	System.out.println("time elapsed>>"+time1);
	
	StringBuffer sb1= new StringBuffer("BufferExp");
	sb1.append(" First examp");
	sb1.append("  ");
	sb1.insert(22, "inserted");
	sb1.replace(25, 28, "Replace");
	sb1.reverse();
	sb1.delete(1, 5);
	
	StringBuilder bu1 =new StringBuilder("great builder");
	bu1.append("kokoko");
	bu1.insert(10,"dear bye");
	System.out.println(bu1);
	
	
	
	System.out.println(sb1);
	//System.out.println(kl);
	/*System.out.println(s1);
	System.out.println(ss1);*/
 String Ch="Tokenizeresw adr rnuhyt";
	StringTokenizer er=new StringTokenizer(Ch);
	int ers =er.countTokens();
	System.out.println(ers);
	 StringTokenizer ST=new StringTokenizer("Sringklo and kiokio and lolpolpo and huyhuyh");
	 System.out.println(ST.countTokens());
	while(ST.hasMoreTokens()){
	 System.out.println(ST.nextToken());
	 //System.out.println(ST.nextToken());
	 System.out.println(ST.nextElement());
	}
	 System.out.println(14.0/49);
	
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
