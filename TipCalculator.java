package practice;

public class TipCalculator {
    static Integer tip;

    public static void main(String[] args) {
        calculateTip(150, "great");
        System.out.println(tip);
    }

    public static Integer calculateTip(double amount, String rating) {
        switch (rating.toLowerCase()) {
            case "terrible":
                tip = (int)Math.round(amount) * 0;
                break;
            case "poor":
                tip = (int)(Math.round(amount) * 0.05);
                break;
            case "good":
                tip = (int)(Math.round(amount) * 0.1);
                break;
            case "great":
                tip = (int)(Math.round(amount) * 0.15);
                break;
            case "excellent":
                tip = (int)(Math.round(amount) * 0.2);
                break;
            case "default":
                tip = null;
        }
        return tip;
        }
    }
