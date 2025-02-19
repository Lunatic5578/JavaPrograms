import java.util.*;

interface Bicycle
{
    int a=20;
    void brake();
    void speedUp();
}

interface Cycle
{
    //int a=25; will give error when getting called because of similar names
    void changeGear();
}

class AvonCycle implements Bicycle,Cycle //multiple implementations are possible
{
    void horn()
    {
        System.out.println("Horn");
    }
    public void brake()
    {
        System.out.println("Break");
    }
    public void speedUp()
    {
        System.out.println("Speeding up");
    }
    public void changeGear()
    {
        System.out.println("Change Gear");
    }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        AvonCycle ob=new AvonCycle();
        ob.horn();
        ob.brake();
        //ob.a=25; <- interface variables cannot be changed as they are final values
        System.out.println(ob.a);
    }    
}
