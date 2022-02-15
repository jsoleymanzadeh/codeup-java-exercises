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
        for (double j = 2; j < 1000000; j *= j) {
            System.out.printf("%d\n", (int) j);
        }
    }
}