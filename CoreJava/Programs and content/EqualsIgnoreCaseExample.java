/*Java String equalsIgnoreCase(): 
------------------------------
This method compares two string on the basis of content but it does not check the case like equals() method. In this method, if the characters match, it returns true else false. For example:*/

public class EqualsIgnoreCaseExample
{ 
public static void main(String args[])
{ 
String s1="hello"; 
String s2="HELLO"; 
String s3="hi";
System.out.println(s1.equalsIgnoreCase(s2));   // returns true
System.out.println(s1.equalsIgnoreCase(s3));   // returns false
}
}