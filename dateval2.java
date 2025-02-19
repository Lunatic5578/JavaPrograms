import java.util.*;
public class dateval2
{
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        int days1[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int days2[]={31,29,31,30,31,30,31,31,30,31,30,31};
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int i=0;
        String input;
        System.out.println("Enter Date(dd/mm/yyyy):");
        input=sc.nextLine();
        int d=Integer.parseInt(input.substring(0,2));
        int m=Integer.parseInt(input.substring(3,5));
        int y=Integer.parseInt(input.substring(6));
        if(((y%4==0)&&(y%100!=0))||(y%400==0))
        {
            i=1;
        }
        if(i==1)
        {
            if(m>0 && m<=12)
            {
                if(d>0 && d<=days2[m-1])
                {
                    System.out.println("VALID DATE");
                    System.out.println(d+","+month[m-1]+" "+y);
                }
                else
                {
                    System.out.println("INVALID DATE");
                }
            }
        }
        else if(i==0)
        {
            if(m>0 && m<=12)
            {
                if(d>0 && d<=days2[m-1])
                {
                    System.out.println("VALID DATE");
                    System.out.println(d+","+month[m-1]+" "+y);
                }
                else
                {
                    System.out.println("INVALID DATE");
                }
            }
        }
       else
       {
        System.out.println("INVALID DATE");
       } 
    }
}