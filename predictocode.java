/* 5 boxes labelled 1 to 5 was being transported one of them was lost. A worker arranged the remaining of the boxes and found that box no. 3 is missing.
 recreate the scenario along with several test cases with any random box being lost while your program finds it. 
 Input:
 1
 2 1 5 3
 Output:
 4

 Input:
 3
 4 5 1 2
 2 5 3 4
 1 5 4 3
 Output:
 3
 1
 2
 */
import java.util.*;

public class predictocode 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int i,j;
      System.out.println("Enter test cases");
      int t=sc.nextInt();
      System.out.println("Enter the numbers of found boxes");
      for(j=0;j<t;j++)
      {
         int b=1+2+3+4+5;
         for(i=0;i<4;i++)
         {
            b=b-sc.nextInt();
         }
         System.out.println("Missing box is "+b);  
         System.out.println();
      }
   }
}