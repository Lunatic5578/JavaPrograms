import java.util.Scanner;

public class HappyNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
            int d;
            int s;
            for(s=0;s!=n;)
            {
                d=c/10;
                s=(int)(s+(Math.pow(d,2)));
                c=c%10;
                if(s==1)
                    break;
                else
                {
                    c=s;
                    s=0;
                }
            }

            if(s==1)
                System.out.println("True"+s);
            else
                System.out.println("False"+s);
    }
}    

