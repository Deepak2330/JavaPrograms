import java.util.Arrays;

public class gothilaa {

public static void fum(String S1,String S2)
{
	String[] s1=S1.split("//s");
	String[] s2=S2.split("//s");
	boolean check=false;
	 if(s1.length==s2.length)
		{
			check=false;

		}
	else
	{
		Arrays.sort(s1);
		Arrays.sort(s2);
		
	}
	 check = Arrays.equals(s1, s2);
if (check==true)
{
	System.out.println(S1+"--"+s1);
	System.out.println(S2+"--"+s2);
}
else {
	System.out.println("gothilaa");
}

}
public static void main(String[] args) {
	fum("peek","keep");
}


}
