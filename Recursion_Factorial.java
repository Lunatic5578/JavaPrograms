 import java.util.*;
 class Recursion_Factorial
 {
     int n,f;
     
     Recursion_Factorial()
     {
         n=0;
     }
     int fact(int num)
     {
         if(num>0)
           return num*fact(num-1);
         return 1;
     }
     void getnumber(int x)
     {
         n=x;
         f=fact(n);
         System.out.println("Factorial "+f);
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int a=sc.nextInt();
         Recursion_Factorial obj=new Recursion_Factorial();
         obj.getnumber(a);
     }
  }
         
             