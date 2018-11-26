package Collections;
import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Cat");
        ll.add("Tiger");
        ll.add("Lion");
        ll.add("Puma");

        Iterator<String> itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
