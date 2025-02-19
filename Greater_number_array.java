 import java.util.*;
 class Greater_number_array
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int i,j;
         int a[]=new int[5];
         System.out.println("Enter the values");
         for (i=0;i<5;i++)
         {
             a[i]=sc.nextInt();
         }
         for (i=0;i<5;i++)
         if(a[i]>20)
         {
            System.out.println("Numbers greater than twenty are "+a[i]);
        }
    }
}
