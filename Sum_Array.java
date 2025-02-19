 import java.util.*;
 class Sum_Array
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[],i,n;
         int s=0;
         System.out.println("Enter the size of the array");
         n=sc.nextInt();
         a=new int[n];
         System.out.println("Enter the values for the array");
         for (i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
            }
            for (i=0;i<n;i++)
            s=s+a[i];
            System.out.println("Sum is "+s);
        }
    }
    