import java.util.*;

class Spiral_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[][], i, j, n, r = 0, s, c = 1;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        a = new int[n][n];
        s = n - 1;
        for (i = 0; i < n; i++) 
        {
            for (j = r; j < s; j++) 
            {
                a[i][j] = c;
                c++;
            }
            for (j = r; j < s; j++) 
            {
                a[j][s] = c;
                c++;
            }
            for (j = s; j > r; j--) 
            {
                a[s][j] = c;
                c++;
            }
            for (j = s; j > r; j--) 
            {
                a[j][i] = c;
                c++;
            }
            r++;
            s--;
        }
        if (n % 2 == 1) 
        {
            a[n / 2][n / 2] = c;
            System.out.println("Spiral Matrix");
            for (i = 0; i < n; i++) 
            {
                for (j = 0; j < n; j++) 
                {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
