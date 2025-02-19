 import java.util.*;
 class Pattern3
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int i,j;
         System.out.println("The pattern is:");
         System.out.println();
         for(i=1;i<=5;i++)
         {
             for(j=i;j>=1;j--)
             {
                 System.out.print(j);
                }
                System.out.println();
            }
        }
    }