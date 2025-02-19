import java.util.*;
class timeadd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int fth,ftm;
        System.out.println("Enter time 1's hour : ");
        int t1h = sc.nextInt();
        System.out.println("Enter time 1's minutes : ");
        int t1m=sc.nextInt();
        System.out.println("Enter time 2's hour : ");
        int t2h = sc.nextInt();
        System.out.println("Enter time 2's minutes : ");
        int t2m=sc.nextInt();
        if(t1m>=60)
        {
            t1h=t1h+1;
            t1m=t1m-60;
        }
        if(t2m>=60)
        {
            t2h=t2h+1;
            t2m=t2m-60;
        }
        fth=t1h+t2h;
        ftm=t1m+t2m;
        System.out.println("Time 1 = "+t1h+" hours "+t1m+" minutes");
        System.out.println("Time 2 = "+t2h+" hours "+t2m+" minutes");
        System.out.println("Final time(sum) = "+fth+" hours "+ftm+" minutes");
        sc.close();
    }
    
}
