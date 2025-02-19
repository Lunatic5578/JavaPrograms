 import java.util.*;
 class Special_Number
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int n=sc.nextInt();
         int d,x=n,i,s=0,f=1;
         while(x>0)
         {
             d=x%10;
             x=x/10;
             for(i=0;i<=d;i++)
             {
                 f=f*i;
                }
                s=s+f;
                f=1;
            }
            if(n==s)
            {
                System.out.println("The numbeer is Special");
            }
            else
            {
                System.out.println("The number is not Special");
            }
        }
    }