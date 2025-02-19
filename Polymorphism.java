import java.util.*;

abstract class Telephone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone extends Telephone
{
    @Override
    public void ring()
    {
        System.out.println("Ringing");
    }
    @Override
    public void lift()
    {
        System.out.println("Lifted");
    }
    @Override
    public void disconnect()
    {
        System.out.println("Disconnected");
    }
    void playGame()
    {
        System.out.println("Playing game");
    }
    void gps()
    {
        System.out.println("Using GPS");
    }
}

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        //Telephone ph=new Telephone(); -->abstract functions are declarred but not defined in telephone class
        Telephone ph=new SmartPhone();
        ph.lift(); //polymorphism is applied to use lift function defined in smartphone by telephone function
        //ph.playGame(); -->playGame is a function for smartphone not telephone
    }
}
