import java.util.*;
class Sort_Diagonal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][],n,i,j,tmp;
        char c;
        System.out.println("Enter the size of 2D array");
        n=sc.nextInt();
        a=new int[n][n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Choose the diagonal that needs to be sorted\nL=Left\tR=Right");
        c=sc.next().charAt(0);
        if(c=='L' || c== 'l')
        {
            for(i=0;i<n-1;i++)
            {
                if(a[i][i]>a[i+1][i+1])
                {
                    tmp=a[i][i];
                    a[i][i]=a[i+1][i+1];
                    a[i+1][i+1]=tmp;
                }
            }
        }
        else if(c=='R' || c=='r')
        {
            for(i=0;i<n-1;i++)
            {
                for(j=n-1;j>0;j--)
                {
                    if(a[i][j]>a[i+1][j-1])
                    {
                        tmp=a[i][j];
                        a[i][j]=a[i+1][j-1];
                        a[i+1][j-1]=tmp;
                    }
                }
            }
        }
        else
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("Output Matrix");
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
        

        
