 import java.util.*;
 class Recursion_Pattern
 {   
     void fun(int n)
     {
         int i=0;
         if(n>1)
         {
            fun(n-1);
            for(i=0;i<n;i++)
            {
               System.out.print("*");
            }
            System.out.println();
         }
     }
 }
         