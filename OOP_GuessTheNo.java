import java.util.*;

class Game
{
    Scanner sc=new Scanner(System.in);
    private int Random;
    private int Guess;
    int count=0,c=0;

    //constructor
    Game()
    {
        Random=(int)(Math.random()*100);
    }

    void takeUserInput()
    {
        System.out.println("Enter a guess within the range of 1-100 ");
        int g=sc.nextInt();

        if(g>100 || g<1)
        {
            System.out.println("Range exceeded.");
            return;
        }
        else
            Guess=g;
    }

    boolean isCorrectNumber()
    {
        if(Guess!=Random)
        {
            if(Guess>Random)
            {
                System.out.println("\nYour number is larger than the actual number");
            }
            else
            {
                System.out.println("\nYour number is smaller than the actual number");
            }
        }
        else
        {
            System.out.println("\nCongratulations! You successfully guessed the number.");
            c=1;
        }

        if(c==0)
            return false;
        else
            return true;
    }

    //setter
    public void setnoOfGuess()
    {
        count=count+1;
    }
    //getter
    public int getnoOfGuess()
    {
        return count;
    }

}


public class OOP_GuessTheNo 
{
    public static void main(String[] args) 
    {
        
        Game obj=new Game();
        //obj.Game(); <-Constructors does not need to be called specifically

        while(obj.c==0)
        {   
            obj.takeUserInput();
            obj.setnoOfGuess();
            obj.isCorrectNumber();
        }
        System.out.println("It took you "+obj.getnoOfGuess()+ " tries");
    }
}
