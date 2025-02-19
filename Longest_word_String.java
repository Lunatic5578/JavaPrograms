 import java.util.*;
 class Longest_word_String
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         String str,w="",x="";
         int l,i;
         char ch;
         System.out.println("Enter a string");
         str=sc.nextLine();
         l=str.length();
         for(i=0;i<l;i++)
         {
             ch=str.charAt(i);
             if(ch!=' ')
             w=w+ch;
             else
             {
                 if(w.length()>x.length())
                 x=w;
                 w="";
                }
            }
            System.out.println("Longest word is "+x);
        }
    }
    
             
