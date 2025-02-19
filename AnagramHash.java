
import java.util.HashMap;
import java.util.Scanner;

public class AnagramHash {

    static HashMap<Character, Integer>makeFreqMap(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch=str.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch, 1);
            }
            else
            {
                int currFreq=map.get(ch);
                map.put(ch, currFreq+1);
            }
        }
        return map;
    }

    public static boolean isAnagram(String s,String s2)
    {
        if(s.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> map1=makeFreqMap(s);
        HashMap<Character,Integer> map2=makeFreqMap(s2);
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        System.out.println(isAnagram(s,s2));
    }
}
