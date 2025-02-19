  import java.util.*;
 class Armstrong_Number
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         int n,d,a,s=0;
         System.out.println("Enter a number");
         n=sc.nextInt();
         a=n;
         while(n>0)
         {
             d=n%10;
             n=n/10;
             s=s+d*d*d;
         }
         if(a==s)
            System.out.println(" Armstrong Number");
            else
            System.out.println("Not an Armstrong Number");
        }
    }
    
            
         