import java.util.*;
import java.util.HashSet;

public class LongestConsecutiveSeqSet {

    static int longestConsecutiveSequence(int nums[])
    {
        int maxlen=0;
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if(!set.contains(num-1))
            {
                int currnum=num;
                int len=1;
                while (set.contains(currnum+1)) {
                    len++;
                    currnum++;
                }
                maxlen=Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) 
        {
            a[i]=sc.nextInt();
        }
        System.out.println(longestConsecutiveSequence(a));
    }
}
