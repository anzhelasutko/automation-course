package practice;

public class RepeatIt {
    public static void main(String[] args) {
        System.out.println(repeatString("Hey", 8));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        StringBuilder repeated = new StringBuilder();
        if (toRepeat instanceof String) {
            for (int i = 0; i < n; i++) {
                repeated.append(toRepeat);
            }
            return repeated.toString();
        } else {
           return "Not a string";
        }
    }
}
