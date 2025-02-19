 import java.util.*;  
 class Sort_Array2D
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a[][],b[],n,m,i,j,tmp,k=0;
         System.out.println("Enter the sizes of the matrix");
         m=sc.nextInt();
         n=sc.nextInt();
         a=new int[m][n];
         b=new int[m*n];
         System.out.println("Enter the values");
         for(i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
                a[i][j]=sc.nextInt();
             }
         }
         System.out.println("Input Matrix");
         for(i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
         for(i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
            {
               b[k]=a[i][j];
               k++;
            }
         }
         for(i=0;i<(m*n);i++)
         {
             for(j=0;j<(m*n)-1-i;j++)
             {
                 if(b[j]>b[j+1])
                 {
                     tmp=b[j];
                     b[j]=b[j+1];
                     b[j+1]=tmp;
                 }
             }
         }
         k=0;
         for(i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
                 a[i][j]=b[k];
                 k++;
             }
         }
         System.out.println("Sorted Matrix");
          for(i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
                 System.out.print(a[i][j]+"\t");
             }
             System.out.println();
         }
        }
    }
         