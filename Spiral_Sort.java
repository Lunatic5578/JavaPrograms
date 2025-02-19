import java.util.*;
class Spiral_Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][],i,j,n,tmp,c=0,k=0;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        a=new int[n][n];
        System.out.println("Enter the values of the array");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int b[]=new int[n*n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               b[k]=a[i][j];
               k++;
            }
        }
        for(i=0;i<(n*n);i++)
        {
            for(j=0;j<(n*n)-1-i;j++)
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
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=b[k];
                k++;
            }
        }
        for(i=n-1,j=0;i>1;i--,j++)
        {
            for(k=j;k<i;k++)
            {
                a[j][k]=b[c++];
            }
            for(k=j;k<i;k++)
            {
                a[k][i]=b[c++];
            }
            for(k=i;k>j;k--)
            {
                a[i][k]=b[c++];
            }
            for(k=i;k>j;k--)  
            {              
                a[k][j]=b[c++];
            }
        }
        
        if(n%2==1)
            a[(n-1)/2][(n-1)/2]=b[c++];  

        System.out.println("Sorted Spiral Matrix");
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
    
 
    