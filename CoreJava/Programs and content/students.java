import java.util.Scanner;
public class students
{
public static void main(String[] args)
{
String name;
int roll,math1,phy,evs;
Scanner SC=new Scanner(System.in);
System.out.print("Enter Name: ");
name=SC.nextline();
System.out.print("Enter Roll: ");
roll=SC.nextInt();
System.out.print("Enter math,phy,evs: ");
math1=SC.nextInt();
phy=SC.nextInt();
evs=SC.nextInt();
int avg1=math+phy+evs/3;
System.out.println("Average of student is: " + avg1); 
}
}