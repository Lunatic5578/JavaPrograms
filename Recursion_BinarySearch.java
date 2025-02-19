import java.util.Scanner;

public class Recursion_BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in sorted order");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element needed to be searched");
        int x=sc.nextInt();
        System.out.println(search(a,x,0,n));
    }
    static int search(int a[],int x,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=(s+e)/2;
        if(a[mid]==x)
        {
            return mid;
        }
        if(a[mid]<x)
        {
            return search(a, x, mid+1, e);
        }
        return search(a, x, s, mid-1);
    }
}
