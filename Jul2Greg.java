 import java.util.*;
public class Jul2Greg
 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the day in Julian Calender");
       int d=sc.nextInt();
       System.out.println("Enter the year");
       int y=sc.nextInt();
       int dy[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
       int l=0,m=0,i=0,j=0,D=0;
       if(y%4==0 && y%100!=0 || y%400==0)
       {
           l++;
       }
       if(l==1 && d<0 && d>366 || l==0 && d<0 && d>365)
       {
           System.out.println("Invalid Date");
       }
       else
       {
            if(l==1)
            {
                dy[2]=29;
            }
            else
            {
                dy[2]=28;
            }

             //incomplete
             
            System.out.println("The Date is "+d+"/"+m+"/"+y);
        }
    }
} 

