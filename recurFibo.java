import java.util.Scanner;

public class recurFibo {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
