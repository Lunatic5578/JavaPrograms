import java.util.Scanner;

public class predicto2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,a=0,b=0;
        String s;
        System.out.println("Test cases");
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("No.of shards");
            n=sc.nextInt();
            if(n%2==0)
            {
                System.out.println("Invalid Input");
                break;
            }
            System.out.println("Series of shards");
            s=sc.next();
            if(n!=s.length())
            {
                System.out.println("Invalid Input");
                break;
            }
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='A')
                   a++;
                else
                   b++;   
            }
            System.out.println("a="+a+" b="+b);
            if(a==(b+1))
            {
                System.out.println("Y");
            }
            else
            {
                System.out.println("N");
            }
            a=b=0;
        }
    }
}
    

