 import java.util.*;
 class Pattern1
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int i,j;
         System.out.println("The pattern is:");
         System.out.println();
         for(i=1;i<=5;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print("*");
                }
                System.out.println();
            }
        }
    }