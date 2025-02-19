 import java.util.*;
 class Pronic_Number
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,p,i=1,c=0;
         System.out.println("Enter a number");
         n=sc.nextInt();
         while(i<=n)
         {
             p=i*(i+1);
             if(p==n)
             {
             c++;
             }
             else
             {
             i++;
             }
         }
            if(c!=0)
            {
                System.out.println("The number is Pronic");
            }
            else
            {
                System.out.println("The numbre is not Pronic");
            }
        }
    }
             