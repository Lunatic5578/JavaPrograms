import java.util.*;

class Array_merge {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = new int[4];
        int b[] = new int[6];
        int c[] = new int[10];
        System.out.println("Enter the values of 1st array");
        for (i = 0; i < 4; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the values of the 2nd array");
        for (i = 0; i < 6; i++) 
        {
            b[i] = sc.nextInt();
        }
        System.out.println("Third array is");
        for (i = 0; i < 10; i++) 
        {
            if (i < 4)
                c[i] = a[i];
            else
                c[i] = b[i - 4];
        }
        for (i = 0; i < 10; i++) 
        {
            System.out.print(c[i]+" ");
        }
    }
}
