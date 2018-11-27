package practice;
import java.util.Arrays;
public class Arrays3 {
        public static String findNeedle(Object[] haystack) {
            for (Object s : haystack) {
                if (s != null) {
                    if (s.equals("needle"))
                        return "found the needle at position" + " " + Arrays.asList(haystack).indexOf(s);
                }
            }
            return "needle not found";
        }
    }
