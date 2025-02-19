import java.util.*;
//import java.math.*;

public class RPS 
{
    static char compChoice;
    static int player=0;
    static int computer=0;

    static void Assign()
    {
        //System.out.println(x);
        int x= (int)(Math.random()*100);
        if(x>=70)
        {
             compChoice='r';
        }
        else if(x<70 && x>=30)
        {
            compChoice= 's';
        }
        else
        {
            compChoice= 'p';
        }
    }

    static String Name(char c)
    {
        if(c=='s')
        {
            return "Scissor";
        }
        else if(c=='p')
        {
            return "Paper";
        }
        else if(c=='r')
        {
            return "Rock";
        }
        return "Invalid Choice";
    }
    
    static void Compare(char playerChoice)
    {
        //char comp='a';
        
        //System.out.println(Generate());
        Assign();
        System.out.print("Computer's choice: "+Name(compChoice));
        System.out.println(" VS Your choice: "+Name(playerChoice));
        if(compChoice==playerChoice)
        {
            System.out.println("Draw");
        }
        else
        {
            if((playerChoice=='r' && compChoice=='s') || (playerChoice=='s' && compChoice=='p') || (playerChoice=='p' && compChoice=='r'))
            {
                System.out.println("You Win!");
                player++;
            }
            else 
            {
                System.out.println("You Lose!");
                computer++;
            }
        }
    }
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rounds you want to play");
        int round=sc.nextInt();
        for(int i=0;i<round;i++)
        {
            System.out.println("Enter 'r' for rock 's' for scissor 'p' for paper");
            char choice=sc.next().charAt(0);
        
            Compare(choice);
        }
        System.out.println("\nFinal Score:\nComputer:"+computer+" You:"+player+"\n");
        if(player>computer)
        {
            System.out.println("You Win!\nCongrats!");
        }
        else if(player<computer)
        {
            System.out.println("You Lost!\nBetter Luck Next Time.");
        }
        else
        {
            System.out.println("Draw!\nLets play again sometime.");
        }
        sc.close();
    }
    
}
