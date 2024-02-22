
//program using switch to check whether a given character is vowel or not

import java.io.*;
class switch1
{
public static void main(String str[]) throws IOException
{
char v;
//Scanner sc=new Scanner(System.in);
System.out.println("\n\tEnter the value for v:");
v=(char)System.in.read();
switch(v)
{
case 'a':
case 'A':   
      
case 'e':
case 'E':

case 'i':
case 'I':

case 'o':
case 'O':

case 'u':
case 'U':System.out.println("Vowel...");


         break;
default:System.out.println("Not a Vowel..");
}
}
}

