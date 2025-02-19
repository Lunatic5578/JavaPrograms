 import java.util.*;
 class String_PalindromeConversion
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string ");
         String s=sc.nextLine();
         String s2="",s3;
         int l=s.length(),i;
         char ch;
         for(i=l-1;i>=0;i--)
         {
             ch=s.charAt(i);
             s2=s2+ch;
            }
                    s3=s + s2.substring(1);
                    System.out.println("The palindrome word is "+s3);
                }
            }
