import java.util.*;

class myException extends Exception  //custom exception class
{
    public myException(String message)
    {
        super(message);
    }
}

class Exceptions2 
{
    static void checkNegatives(int arr[]) throws myException
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<0)
            {
                throw new myException("Error! Negative number found");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[],n;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        a=new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        try 
        {
            checkNegatives(a);
        } 
        catch (myException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
