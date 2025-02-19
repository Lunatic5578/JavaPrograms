import java.util.*;
import java.util.HashMap;

public class LargestSubarrayHash {

    static int zeroSumLargestSubArray(int a[],int n)
    {
        int ans=0;
        int sum=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum=sum+a[i];
            if (map.containsKey(sum)) {
                ans=Math.max(ans,i-map.get(sum));
                c++;
            }
            else
                map.put(sum, i);
        }
        System.out.println("No.of sequence resulting in zero: "+c);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
             a[i]=sc.nextInt();
        }
        System.out.println("Largest sequence resulting in zero: "+zeroSumLargestSubArray(a,n));
    }
}
