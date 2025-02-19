
import java.util.LinkedList; 

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("Hi");
        list.add("Hello");
        list.add("Good");
        list.add(2,"Bye");

        //list.clear() removes all element
        //list.clone() returns a shallow copy
        //acces docs for more such function
        
        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            System.out.print("->"+list.get(i)); //prints in the desireable format
        }
        System.out.println();

        System.out.println(list); //prints in the list format
        System.out.println(list.clone()); //prints in the list format
    }
}
