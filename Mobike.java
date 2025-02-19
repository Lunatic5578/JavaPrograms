 import java.util.*;
 class Mobike
 {
         Scanner sc=new Scanner (System.in);
         int bno,phno,days,charge;
         String name;
         
         void input()
         {
             System.out.println("Enter the bike no.");
             bno=sc.nextInt();
             System.out.println("Enter the name");
             name=sc.nextLine();
             System.out.println("Enter the phone no.");
             phno=sc.nextInt();
             System.out.println("Enter the no.of days");
             days=sc.nextInt();
         }
         void compute()
         {
             if(days<=5)
             charge=500*days;
             else if(days<=10)
             charge=2500+(400*days);
             else
             charge=4500+(200*days);
         }
         void display()
         {
             System.out.println("Bike no.:" +bno);
             System.out.println("Name:" +name);
             System.out.println("Phone no.:" +phno);
             System.out.println("No.of days of rent:" +days);
             System.out.println("Charge:" +charge);
         }
              
         public static void main()
         {
             Mobike obj=new Mobike();
             obj.input();
             obj.compute();
             obj.display();
          }
        }
    