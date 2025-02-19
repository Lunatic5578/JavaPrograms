import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int curr=a[i];
            int min=i-1;
            while(min>=0 && curr<a[min])
            {
                a[min+1]=a[min];
                min--;
            }
            a[min+1]=curr;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    }    
}
