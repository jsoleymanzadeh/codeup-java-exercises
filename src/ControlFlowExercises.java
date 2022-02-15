public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.printf("%d\n", i);
//            i -= 5;
//        } while (i >= -10);
//        double j = 2;
//        do {
//            System.out.printf("%d\n", (int) j);
//            j *= j;
//        } while (j < 1000000);
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.printf("%d\n", i);
//        }
//        for (double j = 2; j < 1000000; j *= j) {
//            System.out.printf("%d\n", (int) j);
//        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.printf("Fizz\n");
            } else if (i % 5 == 0) {
                System.out.printf("Buzz\n");
            } else {
                System.out.printf("%d\n", i);
            }
        }
    }
}