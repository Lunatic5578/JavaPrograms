import java.util.*;

class Vehicle
{
    private int speed;

    void speedUp()
    {
        speed=speed+10;
    }

    public int getSpeed() 
    {
        return speed;
    }
}

class Car extends Vehicle
{
    @Override
    public void speedUp()
    {
        super.speedUp();
        System.out.println("Car's new speed is: "+(getSpeed()+5)+"km/hr");
    }
}

class Bike extends Vehicle
{
    @Override
    public void speedUp()
    {
        super.speedUp();
        System.out.println("Bike's new speed is: "+(getSpeed()+10)+"km/hr");
    }
}

public class Polymorphism2 
{
    public static void main(String[] args) 
    {
        Vehicle ob=new Car();
        Vehicle ob2=new Bike();
        System.out.println("Car's initial speed: "+ob.getSpeed()+"km/hr");
        ob.speedUp();
        System.out.println("Bike's initial speed: "+ob2.getSpeed()+"km/hr");
        ob2.speedUp();
    }
}
