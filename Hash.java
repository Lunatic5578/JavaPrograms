import java.util.LinkedList;

public class Hash {

    static class HashMap<K,V> {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f; 

        
        private class node {
            K key;
            V value;
            
            node(K key, V value){
                this.key=key;
                this.value=value;
            } 
        }

        private int n;
        private LinkedList<node>[] buckets;

        private void rehash()
        {
            LinkedList<node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket:oldBuckets)
            {
                for (var node : bucket) {
                    put(node.key,node.value);
                }
            }
        }

        private void initBuckets(int N){
            buckets =new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }

        private int searchInBucket(LinkedList<node> list, K key){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).key==key) {
                    return i;
                }
            }
            return -1;
        }

        public HashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size()
        {

            return n;
        }

        public void put(K key, V value)
        {
            int bi=HashFunc(key);
            LinkedList<node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei==-1)
            {
                node nod=new node(key, value);
                currBucket.add(nod);
                n++;
            }
            else
            {
                node currNode=currBucket.get(ei);
                currNode.value=value;
            }

            if(n>=buckets.length*DEFAULT_LOAD_FACTOR)
            {
                rehash();
            }
        }

        public V get(K key)
        {
            int bi=HashFunc(key);
            LinkedList<node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei!=-1)
            {
                node currNode=currBucket.get(ei);
                return currNode.value;
            }
            return null;
        }

        public V remove(K key)
        {
            int bi=HashFunc(key);
            LinkedList<node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
            if(ei!=-1)
            {
                node currNode=currBucket.get(ei);
                V val= currNode.value;
                currBucket.remove(ei);
                n--;
                return val;

            }
            return null;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap<>();
        System.out.println("Testing");
        mp.put("a", 1);
        mp.put("b",2);
        mp.put("g",4);
        mp.put("x",40);
        mp.put("y",41);
        mp.put("w",42);
        mp.put("z",43);
        System.out.println("b value:"+mp.get("b"));
        System.out.println("size:"+mp.size());
        mp.put("c",3);
        mp.put("b",20);
        System.out.println("new size:"+mp.size());
        System.out.println("new b:"+mp.get("b"));
        System.out.println("z val:"+mp.get("z"));
        System.out.println("removing:"+mp.remove("g"));
        System.out.println("removing:"+mp.remove("g"));
        System.out.println("final size:"+mp.size());
        System.out.println("w value:"+mp.get("w"));
        System.out.println("x value:"+mp.get("x"));
        System.out.println("y value:"+mp.get("y"));
        System.out.println("z value:"+mp.get("z"));
    }
}

