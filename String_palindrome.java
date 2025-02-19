import java.util.*;

class String_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, s2 = "";
        System.out.println("Enter a string");
        s = sc.nextLine();
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            s2 = s2 + ch;
        }
        if (s.equalsIgnoreCase(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        

        
    }
}
