import java.util.Scanner;

public class leetcode {
        void removeElement(int[] nums, int val) {
            int k=nums.length+1;
            int p=0;
            for(int a=0;a<nums.length;a++)
            {
                if(nums[p]==val)
                {
                    for(int i=p;i<nums.length-1;i++)
                    {
                        nums[i]=nums[i+1];
                        k--;
                    }
                }
                else
                    p++;
            }
            
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter val");
        int v=sc.nextInt();
        leetcode obj=new leetcode();
        obj.removeElement(a,v);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
}
