import java.util.*;

class HashMap {
    public static void main(String[] args) {
        
        Map<String ,Integer> mp=new java.util.HashMap<>();
        mp.put("Jay", 21);
        mp.put("Vicky",20);
        mp.put("Raj",19);
        mp.put("Akash", 20);
        mp.remove("Jay");
        if(mp.containsKey("Jay"))
            System.out.println(mp.get("Jay"));
        else
            System.out.println("Jay Not here\n");

        System.out.println("entryset:"+mp.entrySet());
        System.out.println("keyset:"+mp.keySet());
        System.out.println("values:"+mp.values());
        System.out.println("Akash updated\n");
        mp.put("Akash",21);

        for (String key : mp.keySet()) {
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        mp.put("Jay",20);
        System.out.println("Jay readded\n");
        for (Map.Entry<String,Integer> e : mp.entrySet()) {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}//it is an unordered list*