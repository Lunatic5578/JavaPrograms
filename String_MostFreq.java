import java.util.*;

class String_MostFreq 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toLowerCase();
        char ch,c,w='!';
        int count,freq=0;
        for(c='a';c<='z';c++)
        {
            count=0;
            for(int i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if(ch==c)
                {
                    count++;
                    if(count>freq)
                    {
                        freq=count;
                        w=ch;
                    }
                }
            }
        }
        System.out.println("Most occurred letter is: "+w+"\nIt is occurring "+freq+" times.");
    }
}
