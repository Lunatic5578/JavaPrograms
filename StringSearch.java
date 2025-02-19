 import java.util.*;
 class StringSearch
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter a string");
         String s=sc.nextLine(),s2="";
         s=s+' ';
         int l=s.length(),i,c=0;
         System.out.println("Enter the word to be searched");
         String w=sc.nextLine();
         char ch;
         for(i=0;i<l;i++)
         {
             ch=s.charAt(i);
             
             if(ch!=' ')
                s2=s2+ch;
             else
                if(s2.equals(w))
                    c++;
                else
                    s2="";
            }
            if(c!=0)
            System.out.println("Found");
            else
            System.out.println("Not Found");
        }
    }