
public class stringrev
{
 public static void main(String[] args)
 {
   String string=args[0];
   String reverse = new StringBuffer(string).
   reverse().toString();
   System.out.println("\nString before reverse: "+string);
   System.out.println("String after reverse: "+reverse);
 }
}