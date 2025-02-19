import java.util.*;

abstract class Pen
{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen
{
    public void write()
    {
        System.out.println("write");
    }
    public void refill()
    {
        System.out.println("refill");
    }
    void changeNip()
    {
        System.out.println("Changing nip");
    }
}

public class Abstract2 
{
    public static void main(String[] args) 
    {
        FountainPen ob=new FountainPen();
        ob.write();
        ob.refill();
        ob.changeNip();
    }
}
