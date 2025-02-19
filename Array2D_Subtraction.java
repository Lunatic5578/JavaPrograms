import java.util.*;
 class Array2D_Subtraction
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int a[][],b[][],n,m;
         System.out.println("Enter the sizes of the 2 Matrixes");
         n=sc.nextInt();  
         m=sc.nextInt();
         a=new int[n][m];
         b=new int[n][m];
         int s[][]=new int[n][m];
         System.out.println("Enter the values of 1st Matrix");
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 a[i][j]=sc.nextInt();
             }
         }
         System.out.println("Enter the values of 2nd Matrix");
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 b[i][j]=sc.nextInt();
             }
         }
         System.out.println("1st Matrix");
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
         System.out.println("2nd Matrix");
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(b[i][j]+"\t");
             }
             System.out.println();
         }
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                s[i][j]=a[i][j]-b[i][j];
            }
         }
         System.out.println("Resulting Matrix");
         for (int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(s[i][j]+"\t");
             }
             System.out.println();
         }
        }
    }
