import java.util.*;
class StringFrequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        char ch,c;
        int count,i;
        for(c='A';c<='Z';c++)
        {
            count=0;
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
                if(ch==c)
                count++;
            }
            if(count>0)
                System.out.println(c+" : "+count);
        }
    }
}