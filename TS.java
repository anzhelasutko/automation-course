package Collections;
import java.util.*;

public class TS{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("blue");
        ts.add("white");
        ts.add("orange");
        ts.add("red");

        Iterator itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}