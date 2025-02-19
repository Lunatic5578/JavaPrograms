 import java.util.*;
 class Account
 {
     String name,address,phoneno;
     long accno;
     double balance;
     
       Account()
     {
         name = "";
         address = "";
         phoneno = "";
         accno = 0;
         balance = 0.0;
        }
        void Account (String n ,String a ,String p ,long ac ,double b)
        {  
          name=n;
          address=a;
          phoneno=p;
          accno=ac;
          balance=b;
        }
        void deposit(double d)
        {
            System.out.println("Amount to be deposited "+d);
            balance = balance + d;
            System.out.println("Updated balance "+ balance);
        }
        void withdraw(double w)
        {
            System.out.println("Amount to be withdrawn "+w);
           
            if(w<=balance)
            {
              balance = balance - w;
              System.out.println("Updated balance "+ balance);
            }
            else
            {
                System.out.println("Error! Low balance");
            }
        }
        void display()
        {
            System.out.println("Name "+ name);
            System.out.println("Address "+ address);
            System.out.println("Phone no. "+ phoneno);
            System.out.println("Account no. "+ accno);
            System.out.println("Balance "+ balance);
        }
        public static void main(String[] args)
        {
            Account obj=new Account();
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter name");
            String nam=sc.nextLine();
            
            System.out.println("Enter address");
            String add=sc.nextLine();
            
            System.out.println("Enter phone no.");
            String pno=sc.nextLine();
            
            System.out.println("Enter account no.");
            long acno=sc.nextLong();
            
            System.out.println("Enter balance");  
            double bal=sc.nextDouble();
            
            System.out.println("User's choice"); 
             
            System.out.println("1.Deposit");  
            System.out.println("2.Withdraw");  
            System.out.println("3.Display");   
            int ch=sc.nextInt();
            switch(ch)
            {                                      
               
                case 1:
                System.out.println("Enter amount to be deposited");
                double depo=sc.nextDouble();
                obj.Account(nam,add,pno,acno,bal);
                obj.deposit(depo);
                System.out.println("Press 1 to display before exiting or press 2 to exit");
                int x=sc.nextInt();
                if(x==1)
                {
                    obj.display();
                    break;
                }
                else
                break;
                
                case 2:
                System.out.println("Enter amount to be withdrawn");
                double withd=sc.nextDouble();
                obj.Account(nam,add,pno,acno,bal);
                obj.withdraw(withd);
                System.out.println("Press 1 to display before exiting or press 2 to exit");
                int y=sc.nextInt();
                if(y==1)
                {
                    obj.display();
                    break;
                }
                else
                break;
                
                case 3:
                obj.Account(nam,add,pno,acno,bal);
                obj.display();
                break;
                
                default:
                System.out.println("Wrong Input");
            }
        }
    }
 