package Collections;
import java.util.*;

public class AL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Lemur");
        list.add("Chameleon");
        iterate(list);
        iterateForEach(list);


    }

    public static void iterate(ArrayList list) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("iterator " + itr.next());
        }
    }

    public static void iterateForEach(ArrayList list) {
        for (Object animal : list) {
            System.out.println("for each " + animal);
        }
    }
}
