 import java.util.*;
 class Pattern4
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int i,j;
         System.out.println("The pattern is:");
         System.out.println();
         for(i=1;i<=5;i++)
         {
             for(j=i;j<5;j++)
             {
                 System.out.print(" ");
                }
                for(j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }