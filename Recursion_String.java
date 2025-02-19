 import java.util.*;
 class Recursion_String
 {
     Scanner sc=new Scanner(System.in);
     String str;
     int w;
     
     void InputString()
     {
         System.out.println("Enter the string");
         str=sc.nextLine();
         str=" "+str;
     }
     void counter(int c)
     {
         if(c<str.length()-1)
         {
             char c1=str.charAt(c);
             char ch=str.charAt(c+1);
             if(c1==' '&&(ch=='A' ||ch=='E' ||ch=='O' ||ch=='I' ||ch=='U'))
             w=w+1;
             counter(c+1);
         }
     }
     void Disp()
     {
         System.out.println("Original String "+str);
         System.out.println("Words with capital vowel in the beginning "+w);
     }
     public static void main()
     {
         Recursion_String obj=new Recursion_String();
         obj.InputString();
         obj.counter(0);
         obj.Disp();
     }
 }