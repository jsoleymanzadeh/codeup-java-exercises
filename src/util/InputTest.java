package util;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println(test.yesNo("Are you happy? "));
        System.out.println(test.getInt("Enter a number from 1 to 10: "));
        System.out.println(test.getDouble("Enter a number from 0 to 1: "));
    }
}