package practice;

public class Arrays1 {
        public static int findSmallestInt(int[] args) {
            int min = args[0];
            for (int i = 1; i < args.length; i++) {
                if (args[i] < min) min = args[i];
            }
            return min;
        }
    }

