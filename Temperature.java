import java.util.*;
class FreqWordCount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence :: ");
        String sent = sc.nextLine();
        System.out.println("Enter word to count :: ");
        String sw = sc.next();
        int count = 0;
        
        String s = "";
        for(int i = 0 ; i <  sent.length() ; i++)
        {
            char ch = sent.charAt(i);
            if(ch != ' ')
            {
                s = s + ch;
            }
            else
            {
                  if(s.equals(sw))
                  {
                      count++;
                  }
                  s ="";
            }
        }
        
         System.out.println("FREQUENCY OF THE WORD : "+sw+" IS : "+count);
        sc.close();
    }
}
   
