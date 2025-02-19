import java.util.HashMap;
import java.util.Map;

public class HashFreq {
    public static void main(String[] args) {
        int a[]={5, 13, 12 , 5 , 7, 5, 13, 13, 12};
        Map<Integer,Integer> f=new HashMap<>();
        for(int e : a){
            if(!f.containsKey(e))
            {
                f.put(e,1);
            }
            else
            {
                f.put(e,f.get(e)+1);
            }
        }
        System.out.println(f.entrySet());
        int maxF=0;
        int maxK=-1;
        
        for(var e:f.entrySet()){
            if(e.getValue()>maxF){
                maxF=e.getValue();
                maxK=e.getKey();
            }
        }
        System.out.println(maxK+" is occuring "+maxF+" times.");

        for(var k:f.keySet()){
            if(f.get(k)>maxF)
            {
                maxF=f.get(k);
                maxK=k;
            }
        }

        System.out.println(maxK+" is occuring "+maxF+" times.");
    }
}
