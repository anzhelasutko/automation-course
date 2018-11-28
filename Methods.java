package practice;

public class Methods {

    public int a = 4;
    public static void main(String[] args) {
        method1(1, "word", 2.5);
        method2("adventure", "time", "!");
    }

    static void method1(int a, String b, double c) {
        System.out.println("method 1:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static void method2 (String d, String e, String f) {
        int a = 2;
        System.out.println("method 2: " + d + " " + e + f);
        System.out.println("method 2: ".concat(d).concat(e).concat(f));
        System.out.println(String.format("method 2: %s %s%s", d, e, f));
    }
}
