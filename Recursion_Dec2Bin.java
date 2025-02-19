 import java.util.*;
 class Recursion_Dec2Bin
 {
     void fun1(int n)
     {
         if(n==0) 
            return ;
         fun1(n/2);   
         System.out.print(n%2);
     }
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         Recursion_Dec2Bin obj=new Recursion_Dec2Bin();
         System.out.println("Enter a decimal number");
         int a=sc.nextInt();
         System.out.println("Binary number is ");
         obj.fun1(a);
     }
 }