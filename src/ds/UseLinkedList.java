package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("NJ");
        list.add("PA");

        Iterator it1 = list.listIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        list.remove("NJ");
        System.out.println("After removing a node: ");
        Iterator it2 = list.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
