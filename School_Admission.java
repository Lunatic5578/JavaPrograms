 import java.util.*;
 public class School_Admission
 {
    public static void main()
    {
       Scanner sc = new Scanner(System.in);
       int amt=0,tamt=0,f=0;
       System.out.println("*****************************************************");
       System.out.println("*******SAIFEE GOLDEN JUBILEE ENGLISH PUBLIC SCHOOL*******");
       System.out.println();
       System.out.println("DO YOU WANT YOUR CHILD TO TAKE ADMISSION IN OUR SCHOOL?");
       System.out.println("ENTER 'YES' OR 'NO'");
       String s=sc.nextLine();
       if(s.equalsIgnoreCase("YES"))
       {
       System.out.println("YOU ARE MOST WELCOMED!!");    
       System.out.println("PLEASE APPLY FOR ADMISSION");
       System.out.println();
       
       System.out.println("*************************BASIC DETAILS****************************");
       System.out.println();
       System.out.println("Is your child a MALE or a FEMALE");
       System.out.println();
       System.out.println("Enter 'M' for MALE");           
       System.out.println("Enter 'F' for FEMALE");    
       System.out.println();
       System.out.println("Choose your answer!!");
       String g=sc.nextLine();
       System.out.println("*****************************************************");
       System.out.println("Enter your child's name:");
       String name=sc.nextLine();
       System.out.println("Enter your child's date of birth");
       String birth=sc.nextLine();
       System.out.println("Enter Father's name");
       String fat=sc.nextLine();
       System.out.println("Enter Mother's name");
       String mot=sc.nextLine();
       System.out.println("Enter your contact number");
       long num=sc.nextLong();
       System.out.println();
       System.out.println("************************DETAILS ABOUT ADMISSION*****************************");
       System.out.println();
       System.out.println("Which class do you want your chid to get admission");
       System.out.println();
       System.out.println("Enter '1' for admission in class 1");
       System.out.println("Enter '2' for admission in class 2");
       System.out.println("Enter '3' for admission in class 3");
       System.out.println("Enter '4' for admission in class 4");
       System.out.println("Enter '5' for admission in class 5");
       System.out.println("Enter '6' for admission in class 6");
       System.out.println("Enter '7' for admission in class 7");
       System.out.println("Enter '8' for admission in class 8");
       System.out.println("Enter '9' for admission in class 9");
       System.out.println("Enter '10' for admission in class 10");
       System.out.println("Enter '11' for admission in class 11");
       System.out.println("Enter '12' for admission in class 12");
       System.out.println("*****************************************************");
       System.out.println("Choose your answer");
       int c=sc.nextInt();
       if(c==1||c==2)
       {
                amt=4000;
                f=1500;
            }
       if(c==3||c==4)
       {
                amt=4200;
                f=1800;
            }
       if(c==5||c==6)
       {
                amt=4500;
                f=2000;
            }
       if(c==7||c==8)
       {
                amt=4800;
                f=2300;
            }
       if(c==9||c==10)
       {
                amt=5200;
                f=2800;
            }
       if(c==11||c==12)
       {
                amt=5500;
                f=3200;
            }
       tamt=tamt+amt;
       System.out.println("*****************************************************");
       System.out.println();
       if(c>8)
       {
        System.out.println("*****************************************************");
        System.out.println("Choose the stream in which you want Admission");
        System.out.println();
        System.out.println("Enter '1' for Science");
        System.out.println("Enter '2' for Commerce");                                  
        System.out.println("*****************************************************");
        System.out.println("Choose your answer");
        int st=sc.nextInt();
        System.out.println("*****************************************************");
            if(st==1)
            {
                amt=1500;
            }
            if(c==2)
            {
                amt=1000;
            }
         tamt=tamt+amt;
         System.out.println("*****************************************************");
        
         System.out.println("Choose your Second Language");
         System.out.println();
         System.out.println("Enter '1' for Hindi");                              
         System.out.println("Enter '2' for Bengali");                                 
         System.out.println("Enter '3' for Urdu");                            
         System.out.println("*****************************************************");
         System.out.println("Choose your answer!!");
         int l=sc.nextInt();
         System.out.println("*****************************************************");
         
         System.out.println("Choose your Additional Language");
         System.out.println();
         System.out.println("Enter '1' for Computers(Applicable for all)");                              
         System.out.println("Enter '2' for Arts(Applicable for all)");                                 
         System.out.println("Enter '3' for Economics(Applicable for only Commerce Students)"); 
         System.out.println("*****************************************************");
         System.out.println("Choose your answer!!");
         int a=sc.nextInt();
         System.out.println("*****************************************************");
            if(a==1)
            {
                amt=1000;
            }
            if(a==2)
            {
                amt=700;
            }
            if(a==3)
            {
                amt=900;
            }
          tamt=tamt+amt;
          System.out.println("*****************************************************");
        }
        else
        {
          System.out.println("Choose your Second Language");
          System.out.println();
          System.out.println("Enter '1' for Hindi");                              
          System.out.println("Enter '2' for Bengali");                                 
          System.out.println("Enter '3' for Urdu");                            
          System.out.println("*****************************************************");
          System.out.println("Choose your answer!!");
          int l=sc.nextInt();
          System.out.println("*****************************************************");
        }
        
        System.out.println("*******SAIFEE GOLDEN JUBILEE ENGLISH PUBLIC SCHOOL*******");
        System.out.println("******************TOTAL COST FOR ADMISSION*******************");
        System.out.println("Total Admission cost = Rs."+tamt);
        System.out.println("Amount to be paid per month = Rs."+f);
        System.out.println("Total Admission cost with the fee for first month = Rs."+(tamt+f));
        System.out.println("Thanks for choosing our school for your child!!");
        System.out.println("*****************************************************");
        System.out.println("Please come with your child for a Final Interview.");
        System.out.println("You can contact us before coming on this number:");
        System.out.println("               1234567890");
        System.out.println("*****************************************************");
    }
    else if(s.equalsIgnoreCase("NO"))
    {
        System.out.println("PLEASE SORRY TO BOTHER YOU!!");
        System.out.println("HAVE A NICE DAY!!!");
        System.out.println();
        System.out.println("*****************************************************");
    }
 }
}
