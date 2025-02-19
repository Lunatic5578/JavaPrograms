 import java.util.*;
 class Marksoutput_Array
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int r[],m[],n,i;
         int max=0,min=0;
         System.out.println("Enter the size of the array");
         n=sc.nextInt();
         m=new int[n];
         r=new int[n];
         for (i=0;i<n;i++)
         {
             System.out.println("Enter Rollno.");
             r[i]=sc.nextInt();
             System.out.println("Enter marks");
             m[i]=sc.nextInt();
            }
            for(i=1;i<n;i++)
            {
                if(m[max]<m[i])
                {
                    max=i;
                }
                if(m[min]>m[i])
                {
                    min=i;
                }
            }
            System.out.println("Rollno. with max marks is "+r[max]);
            System.out.println("Roll no. with min marks is "+r[min]);
        }
    }
    