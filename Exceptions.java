
import java.util.*;

class Exceptions 
{
    static void checkDuplicates(int arr[]) throws Exception
    {
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                throw new Exception("Error! Duplicate number found"); //custom exception
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[],s;
        System.out.println("Enter size of array");
        s=sc.nextInt();
        a=new int[s];
        System.out.println("Enter elements in the array");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        try
        {
            checkDuplicates(a);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}