import java.util.*;
class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a[];
        int n,i,s,mid,max,min,p=0;
        {
            System.out.println("Enter the size of the array");
            n=sc.nextInt();
            a=new int[n];
            System.out.println("Enter the value of the array in ascending order");
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the value to be searched");
            s=sc.nextInt();
            for (i=0;i<n;i++)
            {        
                min=0;
                max=n-1;
                while (min<=max)
                {
                    mid=(max+min)/2;
                    if(s<a[mid])
                    {
                        max=mid-1;
                    }
                    else if(s>a[mid])
                    {
                        min=mid+1;
                    }
                    else
                    {
                        p=mid+1;
                        break;
                    }
                }
            }
            if(p!=0)
                System.out.println("Position of the value is "+p);
            else
                System.out.println("Not found");
        }
    }    
}