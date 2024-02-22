//Given two strings (Input strings) and we have to compare them using String.compareTo() method.

import java.util.*;

class CompareStrings
{
	public static void main(String args[])
	{
		//declaring two string objects
		String str1,str2;
		//declaring input stream object 
		Scanner in = new Scanner(System.in);

		//input strings
		System.out.print("Enter first string: ");
		str1 = in.nextLine();
		System.out.print("Enter second string: ");
		str2 = in.nextLine();

		//comparing strings 
		if(str1.compareTo(str2)==0)
			System.out.println("Strings are equal.");
		else
			System.out.println("Strings are not equal.");
	}
}