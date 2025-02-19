import java.util.*;

public class Pattern6 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int s=0;
        int x=0;
        System.out.print("The first "+n+" even numbers are: ");
        for(int i=0;i<n;i++)
        {
            s=s+2;
            x=x+s;
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("The sum of first "+n+" even numbers is: "+x);
        System.out.println();
        for(int i=0;i<5;i++)
        {
            for (int j=i;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
