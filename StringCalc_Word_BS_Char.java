  import java.util.*;
  class StringCalc_Word_BS_Char

 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         String str;
         int l,i,c=0;
         System.out.println("Type a sentence");
         str=sc.nextLine();
         l=str.length();
         System.out.println("Number of characters  "+l);
         for(i=0;i<l;i++)
         {
             if (str.charAt(i)==' ')
             c++;
            }
            System.out.println("Number of blank spaces "+c);
            System.out.println("Number of words "+(c+1));
     
        }
    }
    