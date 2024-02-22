//Trace of a given matrix
import java.util.Scanner;
class TraceMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d, total=0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
      int matrix[][] = new int[m][n];
      System.out.println("Enter the elements of matrix");
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)
            matrix[c][d] = in.nextInt();
      for (c = 0; c < m; c++)
         for (d = 0; d < n; d++)              
            if(c==d)
                total=total+matrix[c][d];
      System.out.println("Trace of the matrix is :"+total);
   }
} 