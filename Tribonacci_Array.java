 import java.util.*;
 class Tribonacci_Array
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int[10],i;
         a[0]=0;
         a[1]=1;
         a[2]=2;
         for (i=3;i<10;i++)
         {
             a[i]=a[i-1]+a[i-2]+a[i-3];
            }
            System.out.println("Tribonacci series are");
            for(i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }