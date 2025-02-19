import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[],i,n,tmp,j,min;
        System.out.println("Enter size of the array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the values ");
        for (i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;            
        }
        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}