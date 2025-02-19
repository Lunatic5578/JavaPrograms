import java.util.*;

public class seminar {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter input");
            
                String s1=sc.next();
                int x=sc.nextInt();
                String a=""+x;
                //Complete this line
                while(a.length()!=3)
                {
                    a="0"+a;
                }
                System.out.println(s1+"\t\t"+a);
            
            System.out.println("================================");

    }
}