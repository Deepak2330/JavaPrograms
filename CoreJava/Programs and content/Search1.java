//Search a Number using Linear Search
import java.util.Scanner;
class Search1
{
   public static void main(String args[])
   {
      int a[]={3, 4, 5, 6, 7, 9};
      int srchNo, index=-1;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the Number to Search :");
      srchNo = in.nextInt();
     for(int i=0;i<a.length;i++)
     {
        if(a[i]==srchNo) 
        {
            index=i+1;
            break;
        }
        else 
            index=-1;
     }
     if(index==-1)
      System.out.println("Number not Found...");
      else
          System.out.println("Number found at position "+index);
   }
} 