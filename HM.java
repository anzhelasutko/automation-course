package Collections;

import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Krakow");
        hm.put(101, "Warsaw");
        hm.put(102, "Gdansk");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

