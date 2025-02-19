 import java.util.*;
 class Greg2Jul
 {
     int dg[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
     
     boolean isLeap(int y)
     {
         if(y%4==0 && y%100!=0 || y%400==0)
         return true;
       return false;
    }
    
    boolean isValid(int d,int m,int y)
    {
        if(d>31 || d<1 || m<1 || m>12 || y<0)
        return false;
        if((m==4 || m==6 || m==9 || m==11)&& d>30)
        return false;
        if(m==2)
        {
            if(isLeap(y)&&d>29)
            return false;
            if(!isLeap(y)&&d>28)
            return false;
        }
        return true;
    }
    
     void greg2jul(int d,int m,int y)
     {
         int i,s=0;
         if(isLeap(y))
         dg[2]=29;
         
         for(i=1;i<m;i++)
         {
             s=s+dg[i];
         }
            s=s+d;
            System.out.println(d+"/"+m+"/"+y+" = "+s+"th day in Julian Calender of the year "+y);
     }
     
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int d,m,y;
         Greg2Jul obj=new Greg2Jul();
         System.out.println("Enter date/month/year ");
         d=sc.nextInt();
         m=sc.nextInt();
         y=sc.nextInt();
         if(obj.isValid(d,m,y))
         obj.greg2jul(d,m,y);
         
         else
         System.out.println("Invalid Date");
        }
    }
     