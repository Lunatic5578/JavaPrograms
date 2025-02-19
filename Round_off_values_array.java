 import java.util.*;
 class Round_off_values_array
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int x,i;
         int a[]=new int [10];
         System.out.println("Enter the values ");
         for (i=0;i<10;i++)
         {
             a[i]=sc.nextInt();
            }
            for (i=0;i<10;i++)
            {
                x=a[i]%100;
                if (x>=50)
                a[i]=a[i]+(100-x);
                else
                a[i]=a[i]-x;
            }
            System.out.println("Rounded values are");
            for (i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }