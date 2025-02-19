 import java.util.*;
 class Max_Min_Array
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int a[],n,i,max=0,min=0;
         System.out.println("Enter the size of the array");
         n=sc.nextInt();
         a=new int[n];
         System.out.println("Enter the value of the array");
         for (i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
            }
            for (i=0;i<n;i++)
            {
                if(a[max]<a[i])
                {
                    max=i;
                }
                if(a[min]>a[i])
                {
                    min=i;
                }
            }
            System.out.println("Maximum value is "+a[max]);
            System.out.println("Minimum value is "+a[min]);
        }
    }
         