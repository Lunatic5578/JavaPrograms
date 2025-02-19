 import java.util.*;
 class Pythagorean_triplets
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int a,b,x,y,z,n,m;
         System.out.println("Enter the limits");
         n=sc.nextInt();
         m=sc.nextInt();
         if(n>m)
         {
             a=m;
             b=n;
         }
         else
         {
             a=n;
             b=m;
         }
         System.out.println("The pythagorean triplets between "+a+" and "+b+" are :"); 
         for(x=a;x<b;x++)
         {
             for(y=x+1;y<b;y++)
             {
                 for(z=y+1;z<b;z++)
                 {
                     if((x*x)==(y*y)+(z*z) || (y*y)==(x*x)+(z*z) || (z*z)==(x*x)+(y*y))
                     {
                         System.out.println(x+" "+y+" "+z);
                     }
                    }
                }
            }
        }
    }
