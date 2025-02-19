 import java.util.*;
 class Binary_Decimal
 {
     public static void main(String [] args)  
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter your choice");
         System.out.println("1.Decimal to Binary");
         System.out.println("2.Binary to Decimal");
         int ch=sc.nextInt();
         switch(ch)
         {
             case 1:
             {
               String op="";
               System.out.println("Enter a number");
               int n=sc.nextInt(),d;
               while(n>0)
               {
                 d=n%2;
                 n=n/2;
                 op=d+op;
               }
               System.out.println(op);
               break;
            }
            case 2:
            {
               int d=0,c=0,b=0;
               System.out.println("Enter a number");
               int n=sc.nextInt();
               while(n>0)
               {
                 d=n%10;
                 n=n/10;
                 b=b+(d*(int)Math.pow(2,c));
                 c++;;
               }
               System.out.println(b);
               break;
            }
            default:
            {
                System.out.println("Wrong choice");
            }
        }
    }
}
    