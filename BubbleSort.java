
import java.util.*;
class BubbleSort
{ 
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a[];
        int n,i,j,tmp;
        {
            System.out.println("Enter the size of the array");
            n=sc.nextInt();
            a=new int[n];
            System.out.println("Enter the value of the array");
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for (i=0;i<n;i++)
            {
                for(j=0;j<n-1;j++)
                {
                    if (a[j]>a[j+1])
                    {
                        tmp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=tmp;
                    }
                }
            }
            System.out.println("Values in ascending order are");
            for (i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}