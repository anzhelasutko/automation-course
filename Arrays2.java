package practice;

public class Arrays2 {
        public int countSheeps(Boolean[] arrayOfSheeps) {
            int counter = 0;
            for (int i = 0; i < arrayOfSheeps.length; i++) {
                if (arrayOfSheeps[i] != null) {
                    if (arrayOfSheeps[i]) counter = counter + 1;
                }
            }
            return counter;
        }
    }
