 import java.util.*;
 class Unique_Number
 {
   public static void main(String[] args)
  {
   int n;
   int flag=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   n=sc.nextInt();
   int c;
   int no=n;
   for(int i=0;i<=9;i++)
   {
     n=no;
     c=0; 
     while(n>0)
     {
       int d=n%10;
       if(d==i)
       c++;
       n=n/10;
     }
     if(c>1)
     flag=0;
   }
   if(flag==1)
   System.out.println("It is a Unique number");
   else
   System.out.println("It is not a Unique nuber");
  }
}

