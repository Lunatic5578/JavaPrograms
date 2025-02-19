 import java.util.*;
 class String_SeparateLines 
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         String s,s2="";
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
                 s2=s2+ch;
                }
                else
                {
                    System.out.println(s2);
                    s2="";
                }
            }
        }
    }