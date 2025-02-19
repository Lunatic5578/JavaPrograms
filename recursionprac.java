import java.util.Scanner;

public class recursionprac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("1. Print in ascending order till n");
        System.out.println("2. Print in descending order till n");
        System.out.println("3. Print factorial of n");
        System.out.println("4. Sum of all number till n");
        System.out.println("5. Sum of all digits of n");
        System.out.println("6. Reverse a number");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        
        switch (ch) {
            case 1:
            {
                System.out.println("Output:");
                print(n);
                break;
            }
            case 2:
            {
                System.out.println("Output:");
                print2(n);
                break;
            }
            case 3:
            {
                System.out.println("Output: "+fact(n));
                break;
            }
            case 4:
            {
                System.out.println("Output: "+sum(n));
                break;
            }
            case 5:
            {
                System.out.println("Output: "+sum2(n));
                break;
            }
            case 6:
            {
                System.out.println("Output: "+rev(n));
                break;
            }
            default:
                break;
        }
    }


    static void print(int n){
        if(n<1)
            return;
        System.out.print(n+" ");
        print(n-1);
    }

    static void print2(int n)
    {
        if(n<1)
            return;
        System.out.print(n+" ");
        print2(--n);
    }

    static int fact(int n){
        if(n==1)
            return 1;
        return n*fact(n-1);
    }

    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }

    static int sum2(int n){
        if(n/10==0)
            return n;
        return n%10+(sum2(n/10));
    }

    static int rev(int n){
        int dig=(int)(Math.log10(n))+1;
        return helper(n,dig);
    }
    private static int helper(int n,int digits)
    {
        if (n/10==0) {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
    }
}