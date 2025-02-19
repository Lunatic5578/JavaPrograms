import java.util.*;

class String_RemoveWord 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        System.out.println("Enter a word you want to remove");
        String word=sc.next();
        word=word.toLowerCase();
        String s2=s.replaceAll(word,"");
        if(s.length()!=s2.length())
        {
            System.out.println("New String: "+s2);
        }
        else
        {
            System.out.println("Word not found.");
        }
    }
}
