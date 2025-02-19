import java.util.*;
//import java.math.*;

class GuessTheNo
{

    static Scanner sc=new Scanner(System.in);
    static int RN,userInt,c=0;

    public GuessTheNo()
    {
        RN=(int)(Math.random()*100);
    } //constructor
    void isCorrect()
    {
        int a=userInt;
        
        if(a!=RN)
        {
            if(a>RN)
            {
                System.out.println("Guess a smaller number");
            }
            else
            {
                System.out.println("Guess a larger number");
            }
        }
        else
        {
            System.out.println("Congratulations! You successfully guessed the number.");
            c=1;
        }
    }
    void takeUserInput()
    {
        System.out.println("Enter your guess (Between the range of 1-100)");
        userInt=sc.nextInt();
        //return userInt;
    }
    public static void main(String[] args)
    {
        int t=0;
        GuessTheNo obj=new GuessTheNo();
        while(c!=1)
        {
            t++;
            obj.takeUserInput();
            obj.isCorrect();
        }
        System.out.println("You took "+t+" tries.");
    }
}