import java.util.*;
class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a[];
        int n,i;
        int x,c=0;
        {
            System.out.println("Enter the size of the array");
            n=sc.nextInt();
            a=new int[n];
            System.out.println("Enter the value of the array");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter value to be searched");
            x=sc.nextInt();
            for (i=0;i<n;i++)
            {
                if (a[i]==x)
                {
                    c++;
                    break;
                }
            }
            if(c>0)
            {
                System.out.println("Found at position "+(i+1));
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
}
        