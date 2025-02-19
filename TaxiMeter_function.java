 import java.util.*;
 class TaxiMeter_function
 {
     Scanner sc=new Scanner(System.in);
     int taxino,km,bill;
     String name;
     void input()
     {
         System.out.println("Enter the name of the passenger");
         name=sc.nextLine();
         System.out.println("Enter the taxi number");
         taxino=sc.nextInt();
         System.out.println("Enter the distance travelled ");
         km=sc.nextInt();
        }
        void display()
        {
            System.out.println("Name\tTaxi number\tDistance\tBill ");
            System.out.println(name+"\t"+taxino+"\t\t"+km+"\t\t"+bill);
        }
         void calculate()
        {
            if(km<6)
            bill=10;
            else if(km<12)
            bill=60+(km-6)*5;
            else if(km<18)
            bill=90+(km-12)*10;
            else
            bill=150+(km-18)*15;
        }
    public static void main()
    {
    TaxiMeter_function obj=new TaxiMeter_function();
    obj.input();
    obj.calculate();
    obj.display();
}
}

    