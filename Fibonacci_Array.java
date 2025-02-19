 import java.util.*;
 class Fibonacci_Array
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[10],i;
         a[0]=0;
         a[1]=1;
         for (i=2;i<10;i++)
         {
             a[i]=a[i-1]+a[i-2];
            }
            System.out.println("Fibonacci series are");
            for(i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }