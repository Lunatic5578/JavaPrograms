 import java.util.*;
 class String_types_of_chars
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner (System.in);
         String str;
         int l,i,c1=0,c2=0,c3=0;
         char ch;
         System.out.println("Enter your string");
         str=sc.nextLine();
         l=str.length();
          for(i=0;i<l;i++)
         {
             ch=str.charAt(i);
             if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
             c1++;
             else if(ch>='0' && ch<='9')
             c2++;
             else
             c3++;
        }
        System.out.println("No.of alphabets="+c1);
         System.out.println("No.of digits="+c2);
          System.out.println("No.of special characters="+c3);
    }
}