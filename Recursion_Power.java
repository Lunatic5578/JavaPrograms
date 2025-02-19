 import java.util.*;
 class Recursion_Power
 {
     Scanner sc=new Scanner(System.in);
     int n,m;
     double p;
     
     Recursion_Power()
     {
         n=0;
         m=0;
         p=0;
     }
     int power(int a,int b)
     {
         if(b==0)
           return 1;
         if(b>0)
           return a*power(a,b-1);
         return a*power(a,b+1);  
     }
     void findresult()
     {
         System.out.println("Enter the number");
         n=sc.nextInt();
         System.out.println("Enter the power");
         m=sc.nextInt();
         p=power(n,m);
     }
     void printresult()
     {
         System.out.println("Value of "+n+" raised to the power of "+m+" is "+p);
     }
     public static void main()
     {
         Recursion_Power obj=new Recursion_Power();
         obj.findresult();
         obj.printresult();
     }
  }
         
             