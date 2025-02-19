

import java.util.*;
class Conversion_String 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str,s2=" ";
        int i,l;
        char ch;
        System.out.println("Input:");
        str=sc.nextLine();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            ch=(char)(ch+32);
            else if(ch>='a' && ch<='z')
            ch=(char)(ch-32);
            s2=s2+ch;
        }
        System.out.println("Output:\n"+s2);
    }
}