import java.util.HashMap;
import java.util.*;

public class IsomorphicHash {

    public static boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Character>map=new HashMap<>();
        if(s.length()!=t.length())
        {
            //System.out.println("size mismatch");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char k=s.charAt(i);
            char v=t.charAt(i);

            if (map.containsKey(k)) {
                if(map.get(k)!=v){
                    //System.out.println("same key diff value");
                    return false;
                }
            }
            
            else if(map.containsValue(v)){
                //System.out.println("same value diff key");
                return false;
            }
            else
            {
                //System.out.println("put working");
                map.put(k, v);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        System.out.println(s1.length()+","+s2.length());
        System.out.println(isIsomorphic(s1,s2));
    }
}
