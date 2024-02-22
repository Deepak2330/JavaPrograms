//Enter 3 number and find out minimum number from the list
import java.util.Scanner;
public class TestClass1 {
    public static void main(String[] args) {
        int a,b,c;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st Number :");
    a = scan.nextInt();
    System.out.println("Enter 2nd Number :");
    b = scan.nextInt();
    System.out.println("Enter 3rd Number :");
    c = scan.nextInt();
    if(a<b)
    {
        if(a<c)
        {
            System.out.println("Minimum number is :"+a);
        }
        else
        {
            System.out.println("Minimum number is :"+c);
        }
    }else
    {
        if(b<c)
        {
            System.out.println("Minimum number is :"+b);
        }
        else
        {
            System.out.println("Minimum number is :"+c);
        }
    }
    }
} 

//Java programs for Students grade as per marks
import java.util.Scanner;
public class StdGrade {
    public static void main(String[] args) {
        int totNum;
    String grade;
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter Total Number of the Student :");
    totNum = scan.nextInt();
    if(totNum>=90)
        grade = "A";
    else if(totNum>=80)
        grade = "B";
    else if(totNum>=70)
        grade = "C";
    else if(totNum>=60)
        grade = "D";
    else
        grade = "F";
    System.out.println("The Grade of the Student is : "+grade);
    }
} 