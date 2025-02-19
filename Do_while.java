 import java.util.*;
 class Do_while
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter 2 numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int p=1,i=1;
         do
         {
             p=p*a;
             i++;
            }
            while (i<=b);
            System.out.println(p);
        }
    }