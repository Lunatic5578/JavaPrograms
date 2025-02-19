 import java.util.*;
 class String_Rev_Word 
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         String s,s2="",w="";
         int i,l;
         char ch;
         System.out.println("Enter a string");
         s=sc.nextLine();
         s=s+' ';
         l=s.length();
         for(i=0;i<l;i++)
         {
             ch=s.charAt(i);
             if(ch!=' ')
             {
                 w=w+ch;
                }
                else
                {
                   s2=w+' '+s2;
                   w="";
                }
            }
            System.out.println(s2);
        }
    }
    
