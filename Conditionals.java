package practice;

public class Conditionals {

    public static void main(String[] args) {

        System.out.println(min(1, 56, 78));
        System.out.println(avg(12, 20, 50));
        System.out.println(sum(2, 5, 10));
    }

    static int min(int a, int b, int c) {
        int minResult;
        if (a < b && a < c) {
            minResult = a;
        } else if (b < a && b < c) {
            minResult = b;
        } else minResult = c;
        return minResult;
    }

    static int avg(int a, int b, int c) {
        int avgResult;
        avgResult = (a + b + c) / 3;
        Math.random();
        return avgResult;
    }

    static int sum(int a, int b, int c) {
        int sumResult;
        sumResult = (a + b + c);
        return sumResult;
    }
}
