import java.util.*;

interface Camera
{
    void Snap();
    void Video();
    private void greet()
    {
        System.out.println("Welcome");
    }
    default void power()
    {
        System.out.println("Powering on");
        greet();
    }
}

interface wifi
{
    String[] getNetwork();
    void Network(String network); 
}

class Phone
{
    void call(long number)
    {
        System.out.println("Calling "+number);
    }
    void message(long number)
    {
        System.out.println("Messaging "+number);
    }
}

class SmartPhone extends Phone implements Camera, wifi
{
    public void Snap()
    {
        System.out.println("Snap taken");
    }
    public void Video()
    {
        System.out.println("Video recorded");
    }
    public String[] getNetwork()
    {
        System.out.println("Getting network list");
        String[] networkList={"Airtel","Jio","Vodafone"};
        return networkList;
    }
    public void Network(String net)
    {
        System.out.println("Connecting to "+ net);
    }
}

public class Interface2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        SmartPhone ob=new SmartPhone();
        ob.power();
        String[] ar=ob.getNetwork();
        for(int i=0;i<ar.length;i++)
        {
            System.out.println((i+1)+". "+ar[i]);
        }
        System.out.println("Enter network choice");
        int j=sc.nextInt();

        ob.Network(ar[j-1]);
        System.out.println("1. Call");
        System.out.println("2. Message");
        System.out.println("Enter choice");
        int ch=sc.nextInt();
        if(ch==1)
            ob.call(1234567890);
        else if(ch==2)
            ob.message(123456789);   
        else
            System.out.println("Invalid choice");
    }
}
