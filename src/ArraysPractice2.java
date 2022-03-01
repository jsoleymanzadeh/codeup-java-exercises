import java.util.Arrays;

public class ArraysPractice2 {
    private static int[] sumEvensAndOdds(int[] numbers) {
        int[] results = {0, 0};
        for (int number : numbers) {
            if (number % 2 == 1) {
                results[0] += number;
            } else {
                results[1] += number;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] test = {2, 4, 8, 5, 1, 2};
        System.out.println(Arrays.toString(sumEvensAndOdds(test)));
    }
}