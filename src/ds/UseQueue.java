package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        line.add("Dave");
        line.add("Mike");
        line.add("Elizabeth");

        Iterator it = line.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
