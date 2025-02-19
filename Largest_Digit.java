 import java.util.*;
 class Largest_Digit
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n,d;
         System.out.println("Enter a number");
         n=sc.nextInt();
         {
             d=n%10;
             n=n/10;
            }
            if (d>n)
            System.out.println("The largest digit is "+d);
            else
            System.out.println("The largest digit is "+n);
        }
    }