 import java.util.*;
 class Prime_Factorsum
 {
     public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=2;i<=n;)
        {
            if(n%i==0)
            {
            System.out.println(i);
            s=s+i;
            n=n/i;
        }
        else
        i++;
    }
    System.out.println("Sum="+s);
  }
}
 