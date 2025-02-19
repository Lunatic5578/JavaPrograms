 import java.util.*;
 class Krishnamurthy_Number
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,f,d,s=0,a,i;
         System.out.println("Enter a number");
         n=sc.nextInt();
         a=n;
         while(n>0)
         {
             d=n%10;
             n=n/10;
            }
            f=1;
            for(i=1;i<=n;i++)
            {
                f=f*i;
            }
            s=s+f;
        if(s==a)
        System.out.println("It is a krishnamurthy number");
        else
        System.out.println("Not a krishnamurthy number");
    }
}

     