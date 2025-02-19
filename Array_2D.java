import java.util.*;
class Array_2D
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][],i,j,n,m;
        System.out.println("Enter the 2 sizes of 2D array");
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
        System.out.println("Your matrix");
        for (i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        if(n==m)
        {
            System.out.println("It is a Square Matrix");
        }
        else
        {
            System.out.println("It is a Rectangular Matrix");
        }
    }
}
        