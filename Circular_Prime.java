 import java.util.*;
 class Circular_Prime
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,r=0,c1=0,c2=0,i;
         System.out.println("Enter a number");
         n=sc.nextInt();
         for(i=1;i<=n;i++)
         {
             if(n%i==0)
             c1++;
            }
            if(c1==2)
            {
                while(n>0)
                {
                    r=r*10+n%10;
                    n=n/10;
                }
                
                for(i=1;i<=r;i++)
                {
                    if(r%i==0)
                    c2++;
                }
                if(c2==2)
                {
                System.out.println("The number is Circular Prime");
                }
                else
                {
                System.out.println("The number is not a Circular Prime");
                }
            }
            else
            System.out.println("The number is not a Circular Prime");
         }
        }

            