/*Java String toCharArray(): 
-------------------------
This method converts the string into a character array i.e first it will calculate the length of the given Java String including spaces and then create an array of char type with the same content. For example:
*/
public class StringToCharArray
{
public static void main(String args[])
{
String s1="Welcome to Java Strings";
char[] ch=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
System.out.println(ch[i]);
}
}
}


