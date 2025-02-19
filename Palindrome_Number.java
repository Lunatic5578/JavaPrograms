 import java.util.*;
 class Palindrome_Number
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int n,d,rev=0,s;
         System.out.println("Enter a number");
         n=sc.nextInt();
         s=n;
         while(n>0)
         {
             d=n%10;
             n=n/10;
             rev=rev*10+d;
            }
            System.out.println("Reverse the number is:"+rev);
            if (rev==s)
            System.out.println("Palindrome");
            else
            System.out.println("Not a palindrome number");
        }
    }
    
            
         