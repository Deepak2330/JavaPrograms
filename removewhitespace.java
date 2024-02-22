import java.util.StringTokenizer;

public class removewhitespace
{ public static void main(String[] args) {
	

  String Str="My name is khan";
  StringTokenizer S= new  StringTokenizer(Str);
	while(S.hasMoreTokens())
	{
  System.out.print(S.nextToken());
	}
	
	
}	
}
