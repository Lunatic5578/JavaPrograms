import java.util.*;

abstract class Parent
{
    public Parent()
    {
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
        //Parent p = new Parent(); -- error bcz abstract functions are not defined
        Child c = new Child();
        //Child2 c2 = new Child2(); -- error bcz abstract functions are not defined
    }
}
