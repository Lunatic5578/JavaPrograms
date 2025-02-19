 import java.util.*;
 class Multiplication_Array2D
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[][],b[][],m,n,m2,n2;
         System.out.println("Enter the sizes of 1st Matrix");
         m=sc.nextInt();  
         n=sc.nextInt();
         a=new int[m][n];
         System.out.println("Enter the sizes of 2nd Matrix");
         m2=sc.nextInt();  
         n2=sc.nextInt();
         b=new int[m2][n2];
         if(n!=m2)
         {
           System.out.println("Invalid.Row of 1st Matrix should be equal to the column of 2nd Matrix");
           System.exit(0);
         }
         else
         {
         int r[][]=new int[m][n2];
         int k,s;
         System.out.println("Enter the values of the 1st Matrix");
         for (int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 a[i][j]=sc.nextInt();
             }
         }
         System.out.println("Enter the values of the 2nd Matrix");
         for (int i=0;i<m2;i++)
         {
             for(int j=0;j<n2;j++)
             {
                 b[i][j]=sc.nextInt();
             }
         }
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n2;j++)
             {
                 s=0;
                 for(k=0;k<n;k++)
                 {
                    s=s+a[i][k]*b[k][j];
                 }
                 r[i][j]=s;
             }
         }
         System.out.println("1st Matrix");
         for (int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
         System.out.println("2nd Matrix");
         for (int i=0;i<m2;i++)
         {
             for(int j=0;j<n2;j++)
             {
                 System.out.print(b[i][j]+"\t");
             }
             System.out.println();
         }
         System.out.println("Resulting Matrix");
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n2;j++)
             {
                 System.out.print(r[i][j]+"\t");
             }
             System.out.println();
         }
        }
    }
}
              
        
                