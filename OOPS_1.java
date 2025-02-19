import java.util.*;
import zshape.rectangle;
import zshape.triangle;

class OOPS_1
{
    
    double pi=3.14;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        oopCircle ob=new oopCircle();
        oopSquare obj=new oopSquare();
        rectangle r=new rectangle();
        triangle t=new triangle();
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Square");
        System.out.println("Enter 3 for Rectangle");
        System.out.println("Enter 4 for triangle");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                ob.main();
                break;
            }
            case 2:
            {
                obj.main();
                break;
            }
            case 3:
            {
                System.out.println("Enter Length");
                r.setLength(sc.nextInt());

                System.out.println("Enter Breadth");
                r.setBreadth(sc.nextInt());
                
                r.area(r.getLength(),r.getBreadth());
                break;
            }
            case 4:
            {
                System.out.println("Enter Breadth");
                t.setBreadth(sc.nextInt());
                System.out.println("Enter Height");
                t.setLength(sc.nextInt());

                t.area(t.getHeight(), t.getBreadth());
                break;
            }
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}

class oopCircle
{
    public void main()
    {
        OOPS_1 obj=new OOPS_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int radius=sc.nextInt();
        double area=radius*radius*obj.pi;
        System.out.println("Area of Circle : "+area);
        sc.close();
    }
}

class oopSquare
{
    public void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("Area of Square : "+area);
        sc.close();
    }
}