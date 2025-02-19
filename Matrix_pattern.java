 import java.util.*;
 class Matrix_pattern
 {
     public static void main(String [] args)
     {
         Scanner sc=new Scanner(System.in);
         int i,j,n;
         System.out.println("Enter the matrix order");
         n=sc.nextInt();
         if(n>10 || n<1)
         {
             System.out.println("Invalid Size");
             System.exit(0);
         }
         char a[][]=new char[n][n];
         System.out.println("Enter 1st character");
         char ch1=sc.next().charAt(0);
         System.out.println("Enter 2nd character");
         char ch2=sc.next().charAt(0);
         System.out.println("Enter 3rd character");
         char ch3=sc.next().charAt(0);
         for(i=0;i<n;i++)
         {
            for(j=0;j<n;j++)
            {
               if(i==j || (i+j)==(n-1))
               a[i][j]=ch3;
               else if(j>i && (i+j)<n || j<i && (i+j)>n-1)
               a[i][j]=ch1;
               else
               a[i][j]=ch2;
            }
        }
        System.out.println("The Matrix is");
        for(i=0;i<n;i++)
        {
           for(j=0;j<n;j++)
           {
              System.out.print(a[i][j]+"\t");
           }
           System.out.println();
        }
     }
  }
    