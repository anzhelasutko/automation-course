package practice;

public class Program {

    public static String upperCaseAllFirst(String value) {

        char[] array = value.toCharArray();
        // Uppercase first letter.
        array[0] = Character.toUpperCase(array[0]);

        // Uppercase all letters that follow a whitespace character.
        for (int i = 1; i < array.length; i++) {
            if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }

        // Result.
        return new String(array);
    }

    public static void main(String[] args) {

        String value = "cat 123 456";
        String value2 = "ONE TWO THREE";

        // Test our code.
        String result = upperCaseAllFirst(value);
        System.out.println(value);
        System.out.println(result);

        result = upperCaseAllFirst(value2);
        System.out.println(value2);
        System.out.println(result);
    }
}
