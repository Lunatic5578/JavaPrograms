 //*
 //**
 //***
 //****
 
 import java.util.*;
 class StringPattern
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
         String s=sc.nextLine();
         String s2="";
         int l=s.length();
         char ch;
         for(int i=0;i<l;i++)
         {
             ch=s.charAt(i);
                s2=s2+ch;
            System.out.println(s2);
         }
      }
    }