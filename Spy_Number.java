 import java.util.*;
 class Spy_Number
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         int n,d,s=0,p=1;
         System.out.println("Enter the number");
         n=sc.nextInt();
         while(n>0)
         {
             d=n%10;
             n=n/10;
             s=s+d;
             p=p*d;
         }
            if (p==s)
            {
            System.out.println("The number is Spy number");
            }
            else
            {
            System.out.println("The number is not a Spy number");
            }
    }
}