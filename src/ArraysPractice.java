public class ArraysPractice {
    private static int sumAll(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 1};
        System.out.println("sumAll(numbers) = " + sumAll(numbers));
    }
}