 import java.util.*;
 class Frequency_array
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[],n,i,c,s;
         System.out.println("Enter the size of the array");
         n=sc.nextInt();
         a=new int [n];
         System.out.println("Enter the values");
         for (i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
            }
            for (i=0;i<n;i++)
            {
            System.out.println("Enter another value");
            s=sc.nextInt();
            c=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==s)
                c++;
            }
            if (c>0)
            System.out.println("Frequency of the number is "+c);
            else 
            {
               System.out.println("Value not found");
            }
        }
    }
}
    
            