 import java.util.*;
 class Denomination
 {
   public static void main()
   {
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter a number");
     int a=sc.nextInt();
     int n[]={2000,500,200,100,50,20,10,5,2,1};
     int i,c;
     for(i=0;i<n.length;i++)
     {
         c=a/n[i];
         if (c!=0)
         {
             System.out.println(n[i]+"\t"+c);
            }
            a=a%n[i];
        }
    }
}
