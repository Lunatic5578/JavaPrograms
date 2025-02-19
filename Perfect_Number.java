  import java.util.*;
  class Perfect_Number
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int i,n,s=0;
         System.out.println("Enter a number");
         n=sc.nextInt();
         for (i=1;i<=n/2;i++)
         {
             if(n%i==0)
             s=s+i;
            }
            System.out.println("Sum:"+s);
            if(s==n)
            System.out.println("Perfect number");
            else
            System.out.println("Not a perfect number");
        }
    }