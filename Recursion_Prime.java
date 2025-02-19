 import java.util.*;
 class Recursion_Prime
 {
     int isPrime(int n,int m)
     {
         if(m<n/2)
         {
             if(n%m==0)
               return 0;
             return isPrime(n,(m+1));
         }
         return 1;
     }
     public void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int a=sc.nextInt();
         int b=2;
         if(isPrime(a,b)==1)
         {
             System.out.println("The number is prime");
         }
         else
         {
             System.out.println("The number is not prime");
         }
     }
  }