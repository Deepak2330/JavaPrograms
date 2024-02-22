//leap yer program:

public class leapyear1 
{
    public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Lead Year :");
    int leapYear = scan.nextInt();
    if(leapYear%4==0)
    {
        System.out.println("February has 29 days");
    }
    else
    {
        System.out.println("February has 28 days");
    }
    }
} 