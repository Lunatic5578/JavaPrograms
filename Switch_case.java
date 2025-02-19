  import java.util.*;
  class Switch_case
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter your choice");
         System.out.println("1.Palindrome Number");
         System.out.println("2.Armstrong Number");
         int c=sc.nextInt();
         switch(c)
         {
             case 1:
             {
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
               
               break;
            }
            case 2:
            {
              int n,d,a,s=0;
              System.out.println("Enter a number");
              n=sc.nextInt();
              a=n;
              while(n>0)
              {
               d=n%10;
               n=n/10;
               s=s*d*d*d;
              }
               if (a==s)
               System.out.println(" Armstrong Number");
               else
               System.out.println("Not a  Armstrong Number");
               
               break;
          }
          default :
          System.out.println("Wrong choice");
        }
      }
    }
    
            
         