import java.util.*;

class Class1{

    int a;

    Class1()
    {
        System.out.println("Non parameter constructor of class1 without specifically using object to call");
    }

    Class1(int a)
    {
        this.a=a; 
        System.out.println("Class 1 a=" +a); //here 'this.a' refers to the parameter a while 'a' refers to the global variable a of Class1 
    }

    void print1()
    {
        System.out.println("Inside Class1 function ");
    }
    void Override()
    {
        System.out.println("Currently inside class1 (Not overriden)");
    }
}

class Class2 extends Class1{  //cannot inherit more than one class 

    @Override  // ->Constructors cannot be overriden but functions can
    void Override()
    {
        System.out.println("Currently inside class2 (Overriden method)");
    }
    Class2(int b,int c) {
        super(b); // <-calls the constructor with the parameter if removed then it will call the non parameterized constructor
        System.out.println("Class2 is called c=" +c);
    }
    void print2()
    {
        System.out.println("Inside Class2 function");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("Default Calling");

        System.out.println("\nUsing class1 objects");
        Class1 ob=new Class1();
        ob.print1();
        ob.Override();
        System.out.println();
        //ob.print2(); <-throws error because it does not inherits class1's methods

        Class2 obj=new Class2(5,10);

        System.out.println("\nUsing class2 objects");
        obj.print1(); // <-does not throws error because it inherits class1's methods
        obj.print2();
        obj.Override();
    }
}
