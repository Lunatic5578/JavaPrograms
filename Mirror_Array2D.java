 import java.util.*;
 class Mirror_Array2D
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[][],i,j,n,m;
         System.out.println("Enter the sizes of 2D array");
         n=sc.nextInt();  
         m=sc.nextInt();
         a=new int[n][m];
         System.out.println("Enter the values");
         for (i=0;i<n;i++)
         {
             for(j=0;j<m;j++)
             {
                 a[i][j]=sc.nextInt();
             }
         }
         System.out.println("Original Array");
         for (i=0;i<n;i++)
         {
             for(j=0;j<m;j++)
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
         System.out.println("Mirror Array");
         for(i=0;i<n;i++)
         {
            for(j=n-1;j>=0;j--)
            {
               System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
        }
    }
                