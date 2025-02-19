 import java.util.*;
 class Recursion_PalStr
 {
     String Revst="";
     String recReverse(String s)
     {
         int l=s.length();
       if(l>0)
       {
          Revst=Revst+s.charAt(l-1);
        recReverse(s.substring(0,l-1));
       }
       else 
       {
       return Revst;
       }
       return Revst;
     }

     void check()
     {
         
         Scanner sc = new Scanner(System.in); 
            String str;
             System.out.println("Enter a string");
             str=sc.nextLine();
             str=str;
             String rev=recReverse(str);
             System.out.println("Original string "+str);
             System.out.println("Reversed string "+rev);
             if(str.equalsIgnoreCase(rev))
             {
                 System.out.println("Palindrome");
             }
             else
             {
                 System.out.println("Not palindrome");
             }
     }

     public static void main(String[] args)
     {
         Recursion_PalStr ob=new Recursion_PalStr();
         ob.check();
     }
 }